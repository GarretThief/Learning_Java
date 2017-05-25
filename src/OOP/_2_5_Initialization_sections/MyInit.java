package OOP._2_5_Initialization_sections;

/**
 * Created by Garret on 13.02.2017.
 */
public class MyInit {
    private static int [] arr = new int[10];
    static {
        for (int i = 0;i<arr.length;i++)
            arr[i]= (int) (100 * Math.random());
    }
    public void printArray(){
        for (int i:this.arr)
            System.out.print(i+" ");
    }
}
