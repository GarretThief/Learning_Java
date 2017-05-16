package OOP.Labs_Old.Laba7;

import java.util.Scanner;

/**
 * Created by Garret on 11.02.2017.
 */
public class Laba7 {
    public static void main(String[] args) {
        System.out.println("Enter value: ");
        Scanner scan = new Scanner(System.in);
        int Number = scan.nextInt();
        for (int i = 1; i<Number;i++)
            if (Number%i == 0)
                System.out.println(i);
    }
}
