package SE.classwork;

import java.io.*;

/**
 * Created by Garret on 23.03.2017.
 */
public class Example1  {
    public static void main(String[] args) throws IOException {
        example1();
        example2();
        example3();
    }

    static void example1 (){
        InputStream stdin = System.in;
        try {
            int val = stdin.read();
            System.out.println(val);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                stdin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void example2(){
        OutputStream stdout = System.out;
        try {
            stdout.write(new byte[]{97,98,99});
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                stdout.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void example3() throws IOException{
        File inputReadFile = new File("input.txt");
        File outputWriteFile = new File("output.txt");

        FileOutputStream fileOutput = new FileOutputStream(inputReadFile);
        FileInputStream fileInput = new FileInputStream(inputReadFile);

        boolean exist = inputReadFile.exists();
        if (exist) inputReadFile.delete();
        System.out.println("inputReadFile created = " + inputReadFile.createNewFile());

        if (outputWriteFile.exists()) outputWriteFile.delete();
        System.out.println("outputReadFile created = " + outputWriteFile.createNewFile());

        fileOutput.write("this is my first file writing".getBytes());

        fileOutput = new FileOutputStream(outputWriteFile);

        int c;
        while ((c = fileInput.read()) != -1){
            fileOutput.write(c);
        }
        if (fileInput != null) fileInput.close();
        if (fileOutput != null) fileOutput.close();
    }
}
