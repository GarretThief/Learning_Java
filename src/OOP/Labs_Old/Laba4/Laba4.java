package OOP.Labs_Old.Laba4;

/**
 * Created by Garret on 11.02.2017.
 */
public class Laba4 {
    public static void main(String[] args){
        int count = 0;
        for (int i =1; i<=300; i++){
            if(count >= 10)
                break;
            if (i%3 == 0 || i%4 == 0) {
                System.out.println(i);
                count++;
           }
        }
    }
}