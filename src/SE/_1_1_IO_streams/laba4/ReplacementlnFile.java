package SE._1_1_IO_streams.laba4;

import java.io.*;
import java.util.Scanner;

public class ReplacementlnFile {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        File file = new File("Code.txt");
        File newFile = new File("newCode.txt");
        if (!newFile.exists()) file.createNewFile();

        FileReader reader = new FileReader(file);
        BufferedReader buffRead = new BufferedReader(reader);
        FileWriter writer = new FileWriter(newFile);
        BufferedWriter buffWrite = new BufferedWriter(writer);
        while (buffRead.ready()){
            String str = (buffRead.readLine().replace("public", "private"));
            buffWrite.write(str);
        }
        buffWrite.flush();
        buffWrite.close();
        buffRead.close();

    }
}
