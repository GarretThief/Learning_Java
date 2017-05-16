package OOP.Labs_Old.Laba5;

import java.util.Scanner;

/**
 * Created by Garret on 11.02.2017.
 */
public class Laba5 {
    public static void main(String[] args) {
        System.out.println("Enter value \"n\": ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;
        for (int i = 1; i<=n;i++)
            sum+=i;
        System.out.println("The Sum is:"+sum);
        System.out.println("The Avg is:"+sum/(double) n);
    }
}
