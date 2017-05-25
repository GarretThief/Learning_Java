package OOP.Labs_Old.Laba1_6_1;

import java.util.Arrays;

/**
 * Created by Garret on 11.02.2017.
 */
public class Laba1_6_1 {
    public static void main(String[] args) {
        int[]Arr = new int[15];
        int j = 2;

        for(int i = 0; i<15;i++) {

            Arr[i] = j;
            j+=2;
        }
        for (int elem : Arr)
            System.out.print(elem);
        System.out.println(Arrays.toString(Arr));
    }
}
