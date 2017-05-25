package SE._1_1_IO_streams.laba1;

import java.io.File;
import java.io.IOException;

/**
 * Created by Garret on 26.03.2017.
 */
public class MyFilesList {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\");
        if (!file.exists()) file.createNewFile();
        for (String item: file.list()) {
            System.out.println(item);
        }
    }
}
