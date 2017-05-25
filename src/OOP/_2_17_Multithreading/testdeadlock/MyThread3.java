package OOP._2_17_Multithreading.testdeadlock;

/**
 * Created by Garret on 23.03.2017.
 */
public class MyThread3 extends Thread {
    @Override
    public void run() {
        synchronized (Main.object3) {
            System.out.println("Thread 3: Holding lock 3...");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 3: Waiting for lock 1...");
            synchronized (Main.object1){
                System.out.println("Thread 3: Holding lock 3 & 1...");
            }
        }
    }
}
