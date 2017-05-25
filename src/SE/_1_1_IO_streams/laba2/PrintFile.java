package SE._1_1_IO_streams.laba2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Garret on 26.03.2017.
 */
public class PrintFile {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("javaTest.txt");
            BufferedReader buff = new BufferedReader(reader);
            while (buff.ready())
                System.out.println(buff.readLine());
            buff.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
