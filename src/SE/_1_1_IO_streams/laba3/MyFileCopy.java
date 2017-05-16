package SE._1_1_IO_streams.laba3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Garret on 26.03.2017.
 */
public class MyFileCopy {
    public static void main(String[] args) throws IOException{
        File file = new File("javaTest.txt");
        FileInputStream input = new FileInputStream(file);

        File newFile = new File("newJavaTest.txt");
        FileOutputStream output = new FileOutputStream(newFile);
        while (input.available() > 0){
            int temp = input.read();
            output.write(temp);
        }
        input.close();
        output.close();
    }
}
