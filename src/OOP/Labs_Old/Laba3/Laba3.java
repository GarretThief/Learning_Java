package OOP.Labs_Old.Laba3;

/**
 * Created by Garret on 11.02.2017.
 */
public class Laba3 {
    public static void main(String[] args){
    System.out.print("* |");
    for (int i = 1; i<10;i++)
        System.out.print(" " + i);
    System.out.println();
    System.out.println("--------------------------");

    for (int i = 1; i<10; i++){
        System.out.print( i + " | ");
        for (int j = 1; j<10; j++)
            System.out.print(i*j + " ");
        System.out.println();
    }
    }
}
