package OOP._2_17_Multithreading.testconcoll1;

/**
 * Created by Garret on 25.03.2017.
 */
public class Reader implements Runnable {
    public static int numberOfThread = 1;
    @Override
    public void run() {
        try {
            Thread.sleep(42);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("~~~~~~~~~Thread "+numberOfThread+"~~~~~~~~~~");
        numberOfThread++;

        for (int i = 0; i < Main.mapa.size(); i++) {
            System.out.println(Main.mapa.get("key" + i));
        }
    }
}
