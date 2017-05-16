package OOP._2_17_Multithreading.testthread3;

/**
 * Created by Garret on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Printer printer = new Printer(storage);
        Counter counter = new Counter(storage);
        new Thread(printer).start();
        new Thread(counter).start();

    }
}
