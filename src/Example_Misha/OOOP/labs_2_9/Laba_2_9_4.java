package OOP.labs_2_9;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Laba_2_9_4 {
  // TODO:  In method main() declare local variables myStr add code which split a string by “space”
  // TODO:  “comma” and “.dot” delimiter using StringTokennizer class, and iterate the
  // TODO:  StringTokenizer elements and print it out one by one to console.
  // TODO:  String myStr = “This is String, split by StringTokenizer. Created by Student:Name of
  // TODO:  Student”.

  public static void main(String[] args) {
    String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
    printClearTokens(myStr);
  }

  private static void printClearTokens(String myStr) {

    StringTokenizer tokenizer =
        new StringTokenizer(myStr, " ,.");
    while (tokenizer.hasMoreElements()) {
      System.out.println(tokenizer.nextToken());
    }

    // OR OTHER WAY ->

    String[] split = myStr.split("([ |.|,])");
    Arrays.stream(split).forEach(System.err::println);
  }
}