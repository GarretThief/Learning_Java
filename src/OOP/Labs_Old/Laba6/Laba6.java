package OOP.Labs_Old.Laba6;

import java.util.Scanner;

/**
 * Created by Garret on 11.02.2017.
 */
public class Laba6 {
    public static void main(String[] args){
        System.out.println("Enter value: ");
        Scanner scan = new Scanner(System.in);
        int Number = scan.nextInt();
        int tmp1 = 0 ;
        int tmp2 = 0 ;
        int tmp3 = 0 ;
        int sum = 0;
        if (Number < 10){
            sum = Number*Number;
        }else if (Number < 100){
            tmp1 = Number/10;
            tmp2 = Number%10;
            sum = tmp1*tmp1 + tmp2*tmp2;
        }else if (Number<1000){
            tmp1 = Number / 100;
            tmp2 = (Number / 10)%10;
            tmp3 = Number % 10;
            sum = tmp1*tmp1 + tmp2*tmp2 + tmp3*tmp3;
        }
        System.out.println("The sum of squares of digits of number: " + sum);
    }
}
