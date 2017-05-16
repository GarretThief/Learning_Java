package OOP.Labs_Old.Laba1_6_7;

/**
 * Created by Garret on 11.02.2017.
 */
public class Laba1_6_7 {
    public static void main(String[] args) {
        int[][] Arr =  {{1, 1, 1, 3, 4},
                        {2, 1, 3, 1, 2},
                        {2, 2, 3, 4, 1},
                        {3, 3, 3, 1, 4}};

        for (int i = 0;i<4;i++){
            int count = 0;
            System.out.print("Line "+(i+1)+": [");
            for(int j = 0;j<5;j++){
                if(Arr[i][j]==1) {
                    if(count>0)
                        System.out.print(",");
                    System.out.print(j);
                    count++;

                }
            }
            System.out.println("]");
        }

    }
}
