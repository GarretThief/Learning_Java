package OOP._2_18_Core_Java_Classes.testcore1;

import java.math.BigInteger;
import java.util.Random;

/**
 *    Write program which calculates the factorial of N,
 *    where N is set at random in the range of 10 to 50 (use BigInteger to get the result).
 * 1) Create a class Main with a factorial() method, which takes one argument as an integer number N
 *    and returns it the factorial.
 * 2) Add in Main class the main() method, which defines a positive integer number,
 *    passes it to the method factorial() and prints the result.
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(40)+10;
        System.out.println(value + "! = " + factorial(value));

    }

    static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
