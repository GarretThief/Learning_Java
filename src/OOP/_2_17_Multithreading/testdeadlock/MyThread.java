package OOP._2_17_Multithreading.testdeadlock;


public class MyThread extends Thread {
    @Override
    public void run() {
        synchronized (Main.object1) {
            System.out.println("Thread 1: Holding lock 1...");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Waiting for lock 2...");
            synchronized (Main.object2){
                System.out.println("Thread 1: Holding lock 1 & 2...");
            }
        }
    }
}
