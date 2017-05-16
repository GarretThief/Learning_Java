package OOP.labs_2_17;

public class Laba_1_And_2 {
  public static void main(String[] args) {
    new BoomTimer(10).run();
  }
}

class BoomTimer extends Thread implements Runnable {// ahahah LOL...
  private final int secToBoom;

  public BoomTimer(int sec) {
    this.secToBoom = sec;
  }

  @Override
  public void run() {
    for (int i = secToBoom; i > 0; i--) {
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.err.println("\t<< B I G \t\t B U U M ! >>");
  }
}