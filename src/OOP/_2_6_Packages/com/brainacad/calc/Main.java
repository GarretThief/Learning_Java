package OOP._2_6_Packages.com.brainacad.calc;

import OOP._2_6_Packages.com.brainacad.shapes.Triangle;

/**
 * Created by Garret on 15.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6,6,6);
        System.out.println(triangle.getArea());
    }
}
