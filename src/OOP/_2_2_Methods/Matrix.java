package OOP._2_2_Methods;

/*
 * Created by Garret on 12.02.2017.
 */
public class Matrix {
    public void additionMatrix(int[][]matrix){
        int sum = 0;
        for (int i = 0;i<matrix.length;i++)
            for (int j = 0;j<matrix[i].length;j++)
                sum+=matrix[i][j];
        System.out.println(sum);
    }
    public void multiplicationMatrix(int[][]matrix){
        int multi = 1;
        for (int i = 0;i<matrix.length;i++)
            for (int j = 0;j<matrix[i].length;j++)
                multi*=matrix[i][j];
        System.out.println(multi);
    }
}
