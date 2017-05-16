package OOP.labs_2_17;

public class Lab_5_Solution {
  public static void main(String[] args) {
    StorageSolution storage = new StorageSolution();
    Printer printer = new Printer(storage);
    Counter counter = new Counter(storage);

    new Thread(printer).start();
    new Thread(counter).start();
  }
}
//=============================================================================================================
//=========================================<< ARTHER CLASSES >>================================================
//=============================================================================================================


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<< STORAGE >>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class StorageSolution {
  private long count = 0;
  private boolean access = true;

  public boolean hasAccess() {
    return access;
  }

  public void revertAccess() {
    access = !access;
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }
}//<<


//___________________________________<< COUNTER >>__________________________________________________________
class Counter implements Runnable {
  private StorageSolution storage;

  public Counter(StorageSolution storage) {// < constructor
    this.storage = storage;
  }

  @Override// thread main>
  public void run() {
    for (int i = 0; i < 1000; i++)
      try {
        this.increment();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
  }

  private void increment() throws InterruptedException {
    synchronized (storage) {
      if (!storage.hasAccess()) // Counter door-in is 'true'
        storage.wait();// <- wait until we end our work->

      long countIt = storage.getCount();
      countIt++;
      storage.setCount(countIt);

      storage.revertAccess();
      storage.notifyAll();
    }
  }
}//<<

// ------------------------------------<< PRINTER >> --------------------------------------------------------
class Printer implements Runnable {
  private StorageSolution storage;

  public Printer(StorageSolution storage) {// < constructor
    this.storage = storage;
  }

  @Override// thread main>
  public void run() {
    for (int i = 0; i < 1000; i++)
      try {
        print();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
  }
  private void print() throws InterruptedException {
    synchronized (storage) {
      if (storage.hasAccess()) // Counter door-in is 'false'
        storage.wait();   // <- wait until we end our work->
      System.out.println(storage.getCount());
      storage.revertAccess();
      storage.notifyAll();
    }
  }
}//<<