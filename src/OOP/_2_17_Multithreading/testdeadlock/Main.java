package OOP._2_17_Multithreading.testdeadlock;

/**   ---Laba 9---
 * 1) Create a class MyThread which extends Thread class.
 * 2) Create a class MyObject.
 * 3) Create a class Main with a main() method.
 *    Provide code which simulates DeadLock using three MyThread objects (threads)
 *    and three MyObject objects (used for synchronization).
 */

public class Main extends Thread{
    public static MyObject object1 = new MyObject();
    public static MyObject object2 = new MyObject();
    public static MyObject object3 = new MyObject();
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        MyThread3 myThread3 = new MyThread3();
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
