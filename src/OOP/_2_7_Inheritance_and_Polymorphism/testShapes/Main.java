package OOP._2_7_Inheritance_and_Polymorphism.testShapes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Garret on 17.02.2017.
 */
public class Main {

        public static void main(String[] args) throws Exception{
//            double sumArea = 0;
//            double sumRectArea = 0;
//            double sumCircleArea = 0;
//            double sumTriangleArea = 0;
//
//            Shape rec = new Rectangle("Blue",11,22);
//            Shape cir = new Circle("Red", 22);
//            Shape tri = new Triangle("Green",5,5,5);
//
//            System.out.println(rec.toString());
//            System.out.printf("Shape area is: %.2f \n",rec.calcArea());
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println(cir.toString());
//            System.out.printf("Shape area is: %.2f \n",cir.calcArea());
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println(tri.toString());
//            System.out.printf("Shape area is: %.2f \n",tri.calcArea());
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//            Shape []shapes = new Shape[9];
//            shapes[0] = new Rectangle("Black",4,5);
//            shapes[1] = new Rectangle("Purple",2,3);
//            shapes[2] = new Rectangle("Grey",6,10);
//            shapes[3] = new Rectangle("Pink",20,30);
//            shapes[4] = new Rectangle("Brown",50,2);
//            shapes[5] = new Triangle("Blue",4,5,6);
//            shapes[6] = new Triangle("White",6,6,6);
//            shapes[7] = new Circle("Red",6);
//            shapes[8] = new Circle("Yellow", 12);

//            for (Shape item : shapes)
//                System.out.printf(item + ", area is: %.2f \n" ,item.calcArea());
//
//            for (Shape item : shapes)
//                sumArea += item.calcArea();
//
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.printf("All shapes total area: %.2f \n" ,sumArea);
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            for (Shape item : shapes){
//                if(item instanceof Rectangle)
//                    sumRectArea += item.calcArea();
//                if(item instanceof Triangle)
//                    sumTriangleArea += item.calcArea();
//                if(item instanceof Circle)
//                    sumCircleArea += item.calcArea();
//            }
//            System.out.printf("Rectandles total area: %.2f \n" , sumRectArea);
//            System.out.printf("Triangle total area: %.2f \n" , sumTriangleArea);
//            System.out.printf("Circle total area: %.2f \n" , sumCircleArea);
//
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//            for (Shape item : shapes)
//                item.draw();

//            Arrays.sort(shapes, Comparator.comparing(Shape::getColorShape));
//            for (Shape item : shapes)
//                item.draw();

//            Shape sha1 = Shape.parseShape("Circle Black 3");
//            Shape sha2 = Shape.parseShape("Rectangle White 3 4");
//            Shape sha3 = Shape.parseShape("Triangle Red 3 4 5");
//            System.out.println(sha1.toString());
//            System.out.println(sha2.toString());
//            System.out.println(sha3.toString());

            System.out.println("Input quantity of shapes: ");
            Scanner scan = new Scanner(System.in);
            Shape[] arrOfShapes = new Shape[Integer.parseInt(scan.nextLine())];
            try {
                for (int i = 0; i < arrOfShapes.length; i++) {
                    arrOfShapes[i] = Shape.parseShape(scan.nextLine());
                }

                scan.close();

                for (Shape shape : arrOfShapes) {
                    shape.draw();
                }
            }catch (Exception e){
                System.out.println(new InvalidShapeStringException().getMessage());
            }

        }
}
