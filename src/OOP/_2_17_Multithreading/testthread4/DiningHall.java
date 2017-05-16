package OOP._2_17_Multithreading.testthread4;

/**
 * 1) Rewrite the DiningHall class so that after the makePizza() method is called 10 times,
 *    the servePizza() method is called once each from 20 different threads.
 * 2) Insert synchronization to eliminate data races in your code, if any exist.
 * 3) Describe what data races may occur in your multithreaded code without synchronization.
 */
public class DiningHall {
        static int pizzaNum = 0;
        static int studentID = 1;

            public static void main(String[] args) {
                MakePizza make = new MakePizza();
                ServePizza serve = new ServePizza();
                new Thread(serve).start();
                new Thread(make).start();


        }
}

