package Example_Misha.OOOP.labs_2_7.MyShapes;

import Example_Misha.OOOP.HolyRandomazer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  private static HolyRandomazer holyRandomazer = new HolyRandomazer();

  public static void main(String[] args) {
    Shape shape = Shape.parseShape("Circle Blue 21");
    if (shape instanceof Circle) {
      Circle shapeCirkle = (Circle) shape;
      // System.out.println(shapeCirkle);
    }


    Shape circle = holyRandomazer.getNewRandomCircle();
    // System.out.printf("\n%s %s %.2f", circle, "\nShape area is: ", circle.calcArea());

    Shape rectangle = holyRandomazer.getNewRandomRectangle();
    //System.out.printf("\n%s %s %.2f", rectangle, "\nShape area is: ", rectangle.calcArea());

    Shape triangle = holyRandomazer.getNewRandomTriangle();
    // System.out.printf("\n%s %s %.2f", triangle, "\nShape area is: ", triangle.calcArea());

    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


    Shape[] shapesArr = new Shape[5];
    for (int i = 0; i < shapesArr.length; i++) {
      shapesArr[i] = holyRandomazer.newRandomShape();
      //shapesArr[i].draw();
    }


/*
    Comparator comparator = Shape.getComparator();
    Arrays.sort(shapesArr, comparator);
    for (Shape shapes : shapesArr)
      shapes.draw();
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
*/

    Arrays.sort(shapesArr, Comparator.comparing(Shape::getShapeColor));
    for (int i = shapesArr.length - 1; i > 0; ) {
      System.out.println(shapesArr[i--]);
    }

/*
    for (Shape sp : shapesArr) {
      System.out.printf("\n%s %s %.2f ", sp,
          "\nShape area is: ", sp.calcArea());
    }*/
    double sumArea = 0;
    for (Shape shap : shapesArr) {
      sumArea += shap.calcArea();
    }
    System.out.printf("\n%s %.2f", "Total area of all shapes: ", sumArea);


    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
/*
    double recSumArea = 0;
    double circleSumArea = 0;
    double triangSumArea = 0;

    for (Shape arr1 : shapesArr) {
      if (arr1 instanceof Rectangle)
        recSumArea += arr1.calcArea();
      if (arr1 instanceof Triangle)
        triangSumArea += arr1.calcArea();
      if (arr1 instanceof Circle)
        circleSumArea += arr1.calcArea();
    }
    System.out.printf("\n%s %.2f", "Total area of Rectangles: ", recSumArea);
    System.out.printf("\n%s %.2f", "Total area of Triangles: ", triangSumArea);
  */ // System.out.printf("\n%s %.2f", "Total area of Circles: ", circleSumArea);
  }


}