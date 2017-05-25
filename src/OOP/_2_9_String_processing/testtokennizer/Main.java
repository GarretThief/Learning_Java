package OOP._2_9_String_processing.testtokennizer;

import java.util.StringTokenizer;

/**
 * Created by Garret on 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Garret.";
        StringTokenizer token = new StringTokenizer(myStr, " ,.");
        do {
            System.out.print(token.nextToken());
        }while (token.hasMoreElements());

    }
}
