package OOP._2_17_Multithreading.testconcoll1;

/**
 * Created by Garret on 25.03.2017.
 */
public class Writer implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (Main.mapa) {
                Main.mapa.put("key" + i, "Value " + i);
            }
        }
    }
}
