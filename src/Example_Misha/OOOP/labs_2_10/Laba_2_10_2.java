package OOP.labs_2_10;

import java.util.Random;

public class Laba_2_10_2 {
  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < random.nextInt(10) + 3; i++) {
      float sumOfNumbers = compute((Math.random() + 1) * 42, random.nextFloat() * 10);
      System.out.printf("\n%10.2f", sumOfNumbers);
    }
  }

  public static Float compute(Number firstNumber, Number secondNumber) {
    return Float.parseFloat(firstNumber+ "") + Float.parseFloat(secondNumber + "");
  }
}