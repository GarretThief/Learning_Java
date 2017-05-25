package OOP._2_18_Core_Java_Classes.testcore4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Garret on 26.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        String[] programs = {"notepad", "calc","mspaint"};
        int i = new Random().nextInt(3);
        System.out.println("Executing " + programs[i]);
        try {
           // Process process = runtime.exec(new Scanner(System.in).nextLine());
            Process process = runtime.exec(programs[i]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
