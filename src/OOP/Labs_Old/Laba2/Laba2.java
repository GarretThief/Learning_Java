package OOP.Labs_Old.Laba2;

import java.util.Scanner;

/**
 * Created by Garret on 09.02.2017.
 */
public class Laba2 {
    public static void main(String[] args){
        System.out.println("Enter value: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        switch (x){
            case 1: System.out.println("One");
                    break;
            case 2: System.out.println("Two");
                    break;
            case 3: System.out.println("Three");
                    break;
            case 4: System.out.println("Four");
                    break;
            case 5: System.out.println("Five");
                    break;
            case 6: System.out.println("Six");
                    break;
            case 7: System.out.println("Seven");
                    break;
            case 8: System.out.println("Eight");
                    break;
            case 9: System.out.println("Nine");
                    break;
            default: System.out.println("Other");
        }
    }
}
