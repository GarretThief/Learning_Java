package OOP._2_4_Static_methods_and_fields;

/**
 * Created by Garret on 13.02.2017.
 */
public class Calculation {
    public static void main(String[] args) {
        int[] arr1 = {34, 6, 8, 5, 34, 23, 56, 76};
        int[] arr2 = {567, 45, 457, 34, 23, 16, 8, 76};
        MyMath find = new MyMath();
        System.out.println(find.findMax(arr1));
        System.out.println(find.findMin(arr2));
    }
}
