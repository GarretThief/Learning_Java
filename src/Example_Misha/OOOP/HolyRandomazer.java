package Example_Misha.OOOP;

import Example_Misha.OOOP.labs_2_7.MyShapes.Circle;
import Example_Misha.OOOP.labs_2_7.MyShapes.Rectangle;
import Example_Misha.OOOP.labs_2_7.MyShapes.Shape;
import Example_Misha.OOOP.labs_2_7.MyShapes.Triangle;

import java.util.Arrays;
import java.util.Random;

public class HolyRandomazer {

  private static Random random = new Random();
  private static String[] colorsArr = {"Blue", "Green", "Orange", "Red", "Rosy"};
  private static double[] numbersArr = {21.0, 19.0, 20.33, 17.19, 11.35, 15.05};

  public static Shape newRandomShape() {
    int choice = random.nextInt(3);
    if (choice == 0) return getNewRandomCircle();
    if (choice == 1) return getNewRandomRectangle();
    return getNewRandomTriangle();
  }

  public static Shape[] getRandomShapeArr() {
    Shape[] shapes = new Shape[random.nextInt(10) + 3];
    for (int i = 0; i < shapes.length; i++)
      shapes[i] = newRandomShape();
    return shapes;
  }

  public static Triangle getNewRandomTriangle() {
    double sideA = getRandomNumber(), sideB = getRandomNumber();
    return new Triangle(getRandomColor(), "Triangle", sideA - 0.4, sideB + 0.7, (random.nextInt((int) (sideA + sideB)) - 3.3) * 0.7);
  }

  public static Rectangle getNewRandomRectangle() {
    return new Rectangle(getRandomColor(), "Rectangle", getRandomNumber(), getRandomNumber());
  }

  public static Circle getNewRandomCircle() {
    return new Circle(getRandomColor(), "Circle", getRandomNumber());
  }

  private static double getRandomNumber() {
    return numbersArr[random.nextInt(numbersArr.length)];
  }

  private static String getRandomColor() {
    return colorsArr[random.nextInt(colorsArr.length)];
  }
}
