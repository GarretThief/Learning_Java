package OOP.labs_2_17;

import java.util.concurrent.atomic.AtomicInteger;

public class Lab_6 {

  public static void main(String[] args) throws InterruptedException {
    System.err.println(" The Hunger Games START -->>\n");
    DiningHall diningHall = new DiningHall(20);
    diningHall.showInnerHell();
  }
}

//=======================================<< Dining Hell >>==============================================================
class DiningHall extends Thread {
  private boolean backing = true;
  private static AtomicInteger pizzaNum = new AtomicInteger(0);
  private final int pizzasCount;
  private final int studentsCount;

  /*constructor>*/DiningHall(int studentsCount) {
    this.studentsCount = studentsCount;
    this.pizzasCount = (int) (studentsCount * 0.7);// somebody must die..))
    System.err.println("studentsCount = " + studentsCount);
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
    for (int i = 0; i <= pizzasCount; i++) {
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

  void showInnerHell() throws InterruptedException {
    new Thread(this).start();
    for (int i = 1; i <= studentsCount; i++) {
      new Student(this, "Valera-" + i).start();
    }
  }
}

//=================================== << Student >>=================================================
class Student extends Thread {
  private String name;
  private DiningHall diningHall;
  private int eatenPizza;

  @Override
  public void run() {
    while (diningHall.isBacking() || diningHall.hasPizza()) {
      synchronized (diningHall) {
        try {
          if (!diningHall.hasPizza()) diningHall.wait();

          if (diningHall.servePizza()) {
            System.out.println("Student " + name + " got a pizza !");
            eatenPizza++;
          }
          diningHall.notifyAll();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
    if (eatenPizza == 0)
      System.out.println("Student " + name + " died..._____<\n");
    else System.err.println(name + " got " + eatenPizza + (eatenPizza > 1 ? " PIZZAS !!!" : " pizza"));
  }

  /*constructor>*/Student(DiningHall diningHall, String sNAME) {
    this.diningHall = diningHall;
    this.name = sNAME;
  }
}