package OOP.Labs_Old.Laba1_6_2;

import java.util.Arrays;

/**
 * Created by Garret on 11.02.2017.
 */
public class Laba1_6_2 {

    public static int SearchMaximum (int[]Arr){
        int max = 0;
        for(int i = 0;i<Arr.length;i++){
            if(Arr[i]>max)
                max = Arr[i];
        }
        return max;
    }
    public static int SearchMinimum (int[]Arr){
        int min = Arr[0];
        for(int i = 0;i<Arr.length;i++){
            if(Arr[i]< min)
                min = Arr[i];
        }
        return min;
    }

    public static void main(String[] args){
        int[]m = new int[]{16,21,5,22,9,29,25,22,11,14,8,30};
        int sum = 0;

        for (int elem:m){
            System.out.print(elem+" ");
        }
        System.out.println();

        for(int i = 0;i<m.length;i++)
            sum+=m[i];

        System.out.println("Min value: "+SearchMinimum(m));
        System.out.println("Max value:"+SearchMaximum(m));
        System.out.println("Avg value:"+sum/m.length);


    }
}
