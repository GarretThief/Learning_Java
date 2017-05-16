package Example_Misha.OOOP.labs_2_7.MyShapes;

import Example_Misha.OOOP.HolyRandomazer;

import java.util.Comparator;
import java.util.StringTokenizer;

public abstract class Shape implements Drawable, Comparable {
  private String shapeColor;
  private String shapeName;

  public String getShapeColor() {
    return shapeColor;
  }

  public void setShapeColor(String shapeColor) {
    this.shapeColor = shapeColor;
  }

  public String getShapeName() {
    return shapeName;
  }

  public void setShapeName(String shapeName) {
    this.shapeName = shapeName;
  }

  public Shape(String shapeColor, String shapeName) {
    this.shapeColor = shapeColor;
    this.shapeName = shapeName;
  }

  public abstract double calcArea();

  public static Shape parseShape(String inputString) {
    try {
      String[] split = inputString.split(" ");
      switch (split[0]) {
        case "Circle":
          if (split.length > 3) throw new RuntimeException("Gump ?");
          return new Circle(split[1], split[0], Double.parseDouble(split[2]));
        case "Rectangle":
          return new Rectangle(split[1], split[0], Double.parseDouble(split[2]), Double.parseDouble(split[3]));
        case "Triangle":
          return new Triangle(split[1], split[0], Double.parseDouble(split[2]), Double.parseDouble(split[3]), Double.parseDouble(split[4]));
        default:
          throw new Exception();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
       System.err.println("Oh common!\nIs that so difficult to write data correct?!\nOk! Don`t worry, Il do it for you...");
    }
    return HolyRandomazer.newRandomShape();
  }

  @Override
  public String toString() {
    return "\nshapeName = " + shapeName +
        "\ncolor: " + shapeColor;
  }

  public static Comparator getComparator() {
    return new Comparator<Shape>() {
      public int compare(Shape o1, Shape o2) {
        if (o1.calcArea() > o2.calcArea()) return -1;
        if (o1.calcArea() < o2.calcArea()) return 1;
        return 0;
      }
    };
  }
}