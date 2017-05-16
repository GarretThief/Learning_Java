package OOP._2_4_Static_methods_and_fields;

/**
 * Created by Garret on 13.02.2017.
 */
public class MyMath {
    final static double PI = 3.14;

    public static double areaOfCircle(int radius){
        double s = 0;
        s = PI*radius*radius;
        return s;
    }

    public static int findMax(int []array){
        int max = 0;
        for (int i: array){
            if (i>max)
                max = i;
        }
        return max;
    }

    public static int findMin(int[]array){
        int min = array[0];
        for (int i: array)
            if (i<min)
                min = i;
        return min;
    }

    public static void main(String[] args) {
        int[] mass = {4,14,2345,76,878,45,2,3,1};
        System.out.println(findMin(mass));
    }
}
