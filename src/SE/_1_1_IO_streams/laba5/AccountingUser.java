package SE._1_1_IO_streams.laba5;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by Garret on 27.03.2017.
 */
public class AccountingUser {
    String name;

    static void testUser(String userName) throws IOException {
        RandomAccessFile file = new RandomAccessFile("users.txt", "rw");

    }

        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input username: ");
            String str = scan.nextLine();
            testUser(str);

    }
}
