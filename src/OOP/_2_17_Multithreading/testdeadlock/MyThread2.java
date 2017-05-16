package OOP._2_17_Multithreading.testdeadlock;

/**
 * Created by Garret on 23.03.2017.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        synchronized (Main.object2) {
            System.out.println("Thread 2: Holding lock 2...");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Waiting for lock 3...");
            synchronized (Main.object3){
                System.out.println("Thread 1: Holding lock 2 & 3...");
            }
        }
    }
}
