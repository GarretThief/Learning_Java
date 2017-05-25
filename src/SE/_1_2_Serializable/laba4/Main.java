package SE._1_2_Serializable.laba4;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("Sasha", "Pavlenko", 24);
        fileInit();
        RandomAccessFile raf = new RandomAccessFile("users.ser","rw");

        raf.writeBytes(user.toString());

        User newUser;
       // System.out.println(newUser);

    }

    static void fileInit () throws IOException {
        File file = new File("users.ser");
        if (!file.exists()) file.createNewFile();
    }
}
