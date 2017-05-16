package OOP._2_11_Exceptions_and_Assertions.exception_demo;

import java.util.Scanner;

/**
 * Created by Garret on 26.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input age of person: ");
        try {
            person.setAge(scan.nextInt());
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
