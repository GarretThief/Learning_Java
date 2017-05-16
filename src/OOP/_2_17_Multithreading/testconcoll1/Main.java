package OOP._2_17_Multithreading.testconcoll1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static Map <String, String> mapa = new HashMap<>();

    public static void main(String[] args) {
        Reader readerThread = new Reader();
        Writer writerThread = new Writer();
        for (int i = 0; i < 5; i++) {

            new Thread(readerThread).start();

        }
        for (int i = 0; i < 5; i++) {
            new Thread(writerThread).start();
        }


    }
}
