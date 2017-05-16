package OOP._2_17_Multithreading.testthread4;

/**
 * Created by Garret on 21.03.2017.
 */
public class ServePizza implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {

            servePizza();
        }
    }
    public void servePizza() {
        String result;
            if (DiningHall.pizzaNum > 0) {
                result = "Норм похавал ";
                DiningHall.pizzaNum--;
            } else result = "Откинулся ";
            System.out.println(result + DiningHall.studentID);
            DiningHall.studentID++;
        }
    }

