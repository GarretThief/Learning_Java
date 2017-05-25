package OOP._2_15_Collections.testcollection1;

import java.util.ArrayList;
import java.util.List;

/** Laba 1
 * Add to method main() code that declares list variable (of List type) of string objects as ArrayList<String>.
 * Write code to fill this list in loop with string values like: “number_” and number of current iteration (from 0 to 10).
 * Add code which iterates over list and print current element value to console.
 **/
public class Main {
    public static void main(String[] args) {
        List<String> listOfStr = new ArrayList<>();
        for (int i = 0;i<10;i++){
            listOfStr.add("number_" + i);
        }
        System.out.println(listOfStr);
    }
}
