package OOP._2_17_Multithreading.testthread4;

/**
 * Created by Garret on 21.03.2017.
 */
public class MakePizza implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makePizza();
        }
    }

    public void makePizza() {
        DiningHall.pizzaNum++;
    }
}

