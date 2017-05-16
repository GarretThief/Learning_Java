package OOP.labs_2_17;

public class Lab_5_BadPractice {
  public static void main(String[] args) {
    new Storage().startMainWork();
  }
}

class Storage {
  void startMainWork() {
/*    new Counter().run();
    new Printer().run();
    //< покажи cо сменой мест >*/


    new Thread(new Printer()).start();
    new Thread(new Counter()).start();
// Where the dog is buried ?
  }

  class Counter implements Runnable {

    private void increment() {
      long countIt = getCount();
      countIt++;
      setCount(countIt);
    }

    @Override
    public void run() {
      for (int i = 0; i < 1000; i++)
        increment();
    }
  }

  class Printer implements Runnable {
    private void print() {
      System.out.println(getCount());
    }

    @Override
    public void run() {
      for (int i = 0; i < 1000; i++)
        if (i % 10 == 0)
          print();
    }
  }

  private long count = 0;

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

}