package OOP._2_1_Class_and_instances;

/**
 * Created by Garret on 12.02.2017.
 */
public class Main_2_1 {
    public static void main(String[] args) {
        Computer[]computers = new Computer[5];
        for (int i = 0;i<computers.length;i++)
            computers[i] = new Computer();

        for (int i = 0;i<computers.length;i++)
            computers[i].setPrice(100*1.1f);

        computers[3].view();
    }
}
