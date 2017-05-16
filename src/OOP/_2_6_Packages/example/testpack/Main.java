package OOP._2_6_Packages.example.testpack;

import OOP._2_6_Packages.com.brainacad.carpack.Car;
import OOP._2_6_Packages.example.applepack.Apple;

/**
 * Created by Garret on 15.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Car car = new Car();

        System.out.println(apple.getMass());
        System.out.println();
        System.out.println(car.getMass());

    }
}
