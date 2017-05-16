package OOP._2_17_Multithreading.testthread2;

import java.util.Arrays;
import java.util.Random;

/**   ---Laba 3---
 * 1) Create a class MySumCount which extends the Thread class.
 *    Add to class MySumCount two integer fields startIndex and stopIndex with setters and getters.
 *    Add to class MySumCount new field as array of integer type and setter for it.
 *    Add to class MySumCount new field resultSum of long type and getter for it.
 * 2) Override the run() method of Thread.
 *    Add code to calculate sum of array elements from startIndex to stopIndex and save result to resultSum field.
 * 3) Add to method main() code that declares local variable myArray as array of integer type (of 1000 size),
 *    and create two instances of MySumCount. Add code to fill all elements of myArray with random integer values
 *    generated from 0 to 1000 range.
 *    Add code to calculates sum of myArray elements in two separate thread and then print result to console.
 *    ---Laba 4---
 * 1) Rewrite classes to provide the same functionality by implement the Runnable interface
 *   (calculates sum of myArray elements in two separate thread and then print result to console).
 */
public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[1000];
        Random rand = new Random();
        for (int i = 0; i<1000; i++){
            myArray[i] = rand.nextInt(1000);
        }

        MySumCount sum1 = new MySumCount();
        MySumCount sum2 = new MySumCount();
        sum1.setArrOfInt(myArray);
        sum1.setStartIndex(0);
        sum1.setStopIndex(499);
        sum2.setArrOfInt(myArray);
        sum2.setStartIndex(500);
        sum2.setStopIndex(999);

        Thread myThready1 = new Thread(sum1);
        Thread myThready2 = new Thread(sum2);
        myThready1.start();
        myThready2.start();

        System.out.println(Arrays.toString(myArray));
        try {
            myThready1.join();
            myThready2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Sum of array elements: " + (sum1.getResultSum()+sum2.getResultSum()));



    }
}
