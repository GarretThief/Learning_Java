package OOP._2_13_Enums.testenum3;

import java.time.DayOfWeek;

/**
 * Created by Garret on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        TrainShedule trainShedule = new TrainShedule(1);
        trainShedule.addTrain();
        System.out.println("printTrains():");
        trainShedule.printTrains();
        System.out.println("searchTrain():");
        trainShedule.searchTrain("Vinnitsa", "Kiev", DayOfWeek.SATURDAY);
    }
}
