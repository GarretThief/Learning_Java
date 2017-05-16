package OOP.Labs_Old.Laba1_6_3;

/**
 * Created by Garret on 11.02.2017.
 */
public class Laba1_6_3 {
    public static void main(String[] args){
        int[][]Arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i = 0;i<4;i++){
            for (int j = 0;j<4;j++)
                System.out.print(Arr[j][i]+" ");
            System.out.println();
        }

    }
}
