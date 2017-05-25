package OOP._2_13_Enums.testenum3;

import java.time.DayOfWeek;
import java.util.Scanner;
/*
1) Add to class Train six fields: number (of int type), stationDispatch (of String type), stationArrival (of String type),
  timeDispatch (оf String type), timeArrival (of String type) and days (array of enum type DayOfWeek,
  containing a list of days of the week), constructor with one parameter (number train) and
  getters/setter for each class field. Override the toString() method in Train to return all information about train.
2) Add to class TrainSchedule private field trains as array of Train and constructor
   with one parameter to allocate memory to the schedule.
 */

public class TrainShedule {
    private Train [] trains;
    static int i = 0;
    public TrainShedule (int amount){
        this.trains = new Train[amount];
    }

    /*
     * 3) Add to class TrainSchedule public method addTrain() without parameters,
     * which read from console (using System.in and Scanner) all information on train,
     * then to create new Train object and pass it to next available array element.
     */
    public void addTrain(){
        Scanner info = new Scanner(System.in);
        System.out.print("Insert number of train: ");
        Train train = new Train(info.nextInt());
        System.out.print("Station of dispatch: ");
        train.setStationDispatch(info.next());
        System.out.print("Time of dispatch: ");
        train.setTimeDispatch(info.next());
        System.out.print("Station of arrival: ");
        train.setStationArrival(info.next());
        System.out.print("Time of arrival: ");
        train.setTimeArrival(info.next());
        System.out.println("Day of this train: ");
        train.setDaysOfWeek(DayOfWeek.valueOf(info.next().toUpperCase()));
        info.close();
        trains[i] = train;
    }

    /*
     * 4) Add to class TrainSchedule public method printTrains() which iterates over
     * trains array in loop and print all information of each train to console.
     */
    public void printTrains(){
        for (Train train : trains) {
            System.out.println(train);
        }
    }

    /*
     * 5) Add to class TrainSchedule public method searchTrain(...) with three parameters,
     * of String type (stationDispatch, stationArrival ) and of DayOfWeek enum type,
     * which searches and print all trains that go to the destination after a specified day of the week.
     */
    public void searchTrain(String stationDispatch, String stationArrival, DayOfWeek inputDay){
        for (Train train : this.trains) {
            if (train.getStationDispatch().equalsIgnoreCase(stationDispatch) &&
                    train.getStationArrival().equalsIgnoreCase(stationArrival) &&
                    train.getDaysOfWeek().toString().equalsIgnoreCase(inputDay.toString()))
                System.out.println(train);
        }
    }

    class Train{
        private int number;
        private String stationDispatch, stationArrival, timeDispatch, timeArrival;
        private DayOfWeek DaysOfWeek;

        public Train(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek getDaysOfWeek() {
            return DaysOfWeek;
        }

        public void setDaysOfWeek(DayOfWeek DaysOfWeek) {
            this.DaysOfWeek = DaysOfWeek;
        }

        @Override
        public String toString() {
            return "Train number: " + number + ".\n" +
                    "Station Dispatch: " + stationDispatch + ".\n" +
                    "Station Arrival: " + stationArrival + ".\n" +
                    "Time Dispatch: " + timeDispatch + ".\n" +
                    "Time Arrival: " + timeArrival + ".\n" +
                    "Day of this train: " + DaysOfWeek;
        }
    }
}
