package Example_Misha.OOOP.labs_2_10;

import Example_Misha.OOOP.labs_2_7.MyShapes.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Laba_2_10_3 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("How long array do you want to create?");
    System.out.print("add length here-");

    Shape[] shapesArr = new Shape[Integer.parseInt(reader.readLine())];
    for (int i = 0; i < shapesArr.length; i++) {
      shapesArr[i] = Shape.parseShape(reader.readLine());
    }
    Arrays.stream(shapesArr).forEach(System.err::println);
  }
}
//Circle BLUE 112
//Triangle Red 12 21 42
//Rectangle BLUE 75 63