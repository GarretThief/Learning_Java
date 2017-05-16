package OOP._2_15_Collections;

/**
 * Created by Garret on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyNumGenerator generator = new MyNumGenerator(5,64);
        generator.gererate();

        MyNumGenerator generator2 = new MyNumGenerator(20,64);
        generator2.generateDistinct();
    }
}
