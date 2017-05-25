package OOP._2_15_Collections.testcollection2;


import java.util.*;

/**
 * Add to method main() code that declares list variable (of List type) of string objects as LinkedList<String>.
 * Write code to fill this list in loop with string values like: “num_” and number of current iteration (from 0 to 10).
 * But element insertion point must be generated randomly (from 0 to current collection length).
 * Add code which iterates over list and print current element value to console.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> linkListOfStr = new HashSet<>();
        for (int i = 0; i<10; i++){
            linkListOfStr.add("num_" + i);
        }

        System.out.println(linkListOfStr);

    }
}
