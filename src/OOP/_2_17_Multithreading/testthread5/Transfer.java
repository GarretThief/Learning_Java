package OOP._2_17_Multithreading.testthread5;

import java.util.Random;

/**
 * Created by Garret on 21.03.2017.
 */
public class Transfer implements Runnable{
    private Bank bank;
    private int from;
    private int max;

    public Transfer(Bank bank, int max_amount) {
        this.bank = bank;
        max = max_amount;
    }

    @Override
    public void run() {
        while (true){
            Random random = new Random();
            int from = random.nextInt(4);
            int to = random.nextInt(4);
            bank.transfer(from,to,random.nextInt(max));
        }
    }
}
