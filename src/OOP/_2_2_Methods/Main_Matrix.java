package OOP._2_2_Methods;

/**
 * Created by Garret on 12.02.2017.
 */
public class Main_Matrix {
    public static void main(String[] args){
        int[][]arr = {{1,2,3},{4,5,6},{7,8,2}};
        Matrix matrix = new Matrix();
        matrix.additionMatrix(arr);
        matrix.multiplicationMatrix(arr);
    }
}
