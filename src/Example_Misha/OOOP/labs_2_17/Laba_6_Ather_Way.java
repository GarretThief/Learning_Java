package OOP.labs_2_17;

import com.sun.corba.se.impl.orbutil.closure.Future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Laba_6_Ather_Way {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    System.err.println(" The Hunger Games START -->>\n");
    Dining dining = new Dining(20);
    dining.showInnerHell();
  }
}

//=======================================<< Dining Hell >>==============================================================
class Dining extends Thread {
  private boolean backing = true;
  private static AtomicInteger pizzaNum = new AtomicInteger(0);
  private final int pizzasCount;
  private final int soldgersCount;

  /*constructor>*/Dining(int soldgersCount) {
    this.soldgersCount = soldgersCount;
    this.pizzasCount = (int) (soldgersCount * 0.7);// somebody mast die..))
    System.err.println("soldgersCount = " + soldgersCount);
    System.err.println("pizzasCount = " + pizzasCount);
    System.err.println("\n__________________________________________________________>>");
  }

  @Override
  public void run() {
    try {
      System.err.println("DiningHall -> makePizza()\n__________________________________________________________>>");
      makePizza();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private void makePizza() throws InterruptedException {
    Thread.sleep(77);
    for (int i = 1; i <= pizzasCount; i++) {
      System.out.println("pizza - " + i);
      synchronized (this) {
        pizzaNum.incrementAndGet();
        Thread.sleep(77);
        this.notifyAll();
      }
      Thread.sleep(77);
    }
    System.err.println("_____________________________<-end Of backing->____________________________________________");
    backing = false;
  }

  boolean isBacking() {
    return backing;
  }

  boolean hasPizza() {
    return pizzaNum.get() > 0;
  }

  boolean servePizza() {
    return hasPizza() && pizzaNum.decrementAndGet() >= 0;
  }

  void showInnerHell() throws InterruptedException, ExecutionException {
    new Thread(this).start();

    //ExecutorService POOL = Executors.newFixedThreadPool(soldgersCount);
    // implement SEMAPHOR in code

    List<FutureTask<Soldger>> futures = new ArrayList<>();
    for (int i = 0; i <= soldgersCount; i++) {
      futures.add(new FutureTask<Soldger>(new Soldger(this, "Vasya-" + i + 1)));
      new Thread(futures.get(i)).start();
    }

    for (FutureTask<Soldger> task : futures) {
      Soldger soldger = task.get();
      String name = soldger.getName();
      int eatenPizza = soldger.getEatenPizza();
      if (eatenPizza != 0) System.err.println(name + " eat " + eatenPizza +(eatenPizza > 1 ? " PIZZAS !!!" : " pizza"));
      else System.out.println(name + " is lazy slave! --> he DIED ! ");
    }
  }
}

//=================================== << Soldger >>=================================================
class Soldger implements Callable<Soldger> {
  private String name;
  private Dining dining;
  private int eatenPizza;

  /*constructor>*/Soldger(Dining dining, String sNAME) {
    this.dining = dining;
    this.name = sNAME;
  }

  @Override
  public Soldger call() throws Exception {
    while (dining.isBacking() || dining.hasPizza()) {
      synchronized (dining) {
        try {
          if (!dining.hasPizza()) dining.wait();

          if (dining.servePizza()) {
            System.out.println("Student " + name + " got a pizza !");
            eatenPizza++;
          }
          dining.notifyAll();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
    return this;
  }

  public String getName() {
    return name;
  }

  public int getEatenPizza() {
    return eatenPizza;
  }
}
