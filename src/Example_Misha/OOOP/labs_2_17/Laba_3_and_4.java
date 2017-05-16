package OOP.labs_2_17;

import java.util.Random;

public class Laba_3_and_4 {
  public static void main(String[] args) throws InterruptedException {
    MySumCount mySumCount = new MySumCount();
    int[] numsARR = new int[10000];

// Разница между методами start() и run() ?
// пример:
    Thread threadInit = new Thread(new Runnable() {
      @Override
      public void run() {
        Random random = new Random();
        for (int i = 0; i < numsARR.length; i++)
          numsARR[i] = random.nextInt(10000);
        // System.out.println(numsARR[50]);
      }
    });// <<-- simplified ? running in main thread ->> (no, didn't hear... :))
    threadInit.start();
    threadInit.join();

    mySumCount.setIntARR(numsARR);
    mySumCount.setStartCount(3);
    mySumCount.setStopCount(numsARR.length - numsARR.length / 2); // why does IDEA keeping silence ?? (hardcode)
    mySumCount.start();
    mySumCount.join(); // <- wait for me, pls, I'll do some work for you!
    System.out.println(mySumCount.getResultSum());
  }
}

class MySumCount extends Thread implements Runnable {
  private int startCount = 0;
  private int stopCount;
  private int[] intARR;
  private long resultSum;

  @Override
  public void run() {
    if (intARR == null || startCount < 0 || stopCount > intARR.length) return;
    for (int i = startCount; i < stopCount; i++)
      resultSum += intARR[i];
  }

  // GETTERS & SETTERS here>>
  void setStartCount(int startCount) {
    this.startCount = startCount;
  }

  void setStopCount(int stopCount) {
    this.stopCount = stopCount;
  }

  void setIntARR(int[] intARR) {
    this.intARR = intARR;
  }

  long getResultSum() {
    return resultSum;
  }
}