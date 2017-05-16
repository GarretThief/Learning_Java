import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Temp {
  public static void main(String[] args) throws IOException {
    example1();

  }

  private static void example1() throws IOException {

    File inputReadFile = new File("input.txt");
    File outputWriteFile = new File("output.txt");

    FileOutputStream out = new FileOutputStream(inputReadFile);
    FileInputStream in = new FileInputStream(inputReadFile);

    if (inputReadFile.exists() && outputWriteFile.exists()) {
      inputReadFile.delete();
      outputWriteFile.delete();
      System.err.println("I've deleted files, my lord! I KILLED THEM ALL...");
      return;
    }

    System.out.println("inputReadFile created = " + inputReadFile.createNewFile());
    System.out.println("outputWriteFile created = " + outputWriteFile.createNewFile());

    out.write("this is my first file writing".getBytes());

    out = new FileOutputStream(outputWriteFile);

    int c;
    while ((c = in.read()) != -1)
      out.write(c);

    in.close();
    out.close();

  }
}
