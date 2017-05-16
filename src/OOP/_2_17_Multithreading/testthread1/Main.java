package OOP._2_17_Multithreading.testthread1;

/**   ---Laba 1---
 * 1) Create a class MyTimeBomb which extends the Thread class.
 * 2) Override the run() method of Thread. This is where the code will go that will output to console
 *    the numbers from 10 to 0 and after that prints “Boom!!!”.
 * 3) Use the static method Thread.sleep() to pause for one second.
 * 4) Add to method main() code that declares local variable bomb1 of MyTimeBomb type, and create instance of MyTimeBomb.
 *    Add code to invoke start() method.
 *    ---Laba 2---
 * 1) Rewrite the MyTimeBomb class to implement the Runnable interface.
 * 2) In this exercise, you will create a simple counting thread by implement the Runnable interface.
 *    It will count to 10, pausing one second between each number.
 *    Also, in keeping with the counting theme, it will output a string every ten numbers.
 */
public class Main {
    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
//        bomb1.start();

        Thread myThready = new Thread(bomb1);
        myThready.start();


    }
}
