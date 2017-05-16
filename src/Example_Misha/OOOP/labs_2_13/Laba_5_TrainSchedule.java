package OOP.labs_2_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Laba_5_TrainSchedule {
  private Train[] trains;
  private int count = 0;
  private BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

  public Laba_5_TrainSchedule() {
    while (true) {
      try {
        System.out.println("How many TRAINS do you want add ?\nwrite number here: ");
        this.trains = new Train[Integer.parseInt(scanner.readLine())];
        break;
      } catch (Exception exception) {
        System.out.println("Are your hands from as ?!\ntry again and be careful!");
      }
    }
  }

  public void addTrain() {
    int number;
    String stationDispatch;
    String stationArrival;
    String timeDispatch;
    String timeArrival;
    Train.Days dayArrival;
    while (count < trains.length && trains[count] == null) {
      try {
        System.out.print("\nEnter trains NUMBER: ");
        number = Integer.parseInt(scanner.readLine());

        System.out.print("\nStation Dispatch: ");
        stationDispatch = scanner.readLine();

        System.out.print("\nStation Arrival: ");
        stationArrival = scanner.readLine();

        System.out.print("\nTime Dispatch: ");
        timeDispatch = scanner.readLine();

        System.out.print("\nTimeArrival: ");
        timeArrival = scanner.readLine();

        System.out.print("\nDay Arrival: ");
        dayArrival = Train.Days.valueOf(scanner.readLine().toUpperCase());

        validation(stationDispatch, stationArrival);
        trains[count] = new Train(number, stationDispatch, stationArrival, timeDispatch, timeArrival, dayArrival);
        count++;
      } catch (Exception e) { // if something went wrong -> TRY AGAIN
        System.out.println(e.getMessage());
        System.out.println("TRY AGAIN:");
      }// if all OK -> get out of method...
    }
  }

  private void validation(String stationDispatch, String stationArrival) throws Exception {
    if (!stationDispatch.matches("[a-z-A-Z]") && !stationArrival.matches("[a-zA-Z]+"))
      throw new Exception("in Dispatch &  Arrival   must be TEXT ONLY!");
  }

  public void printAllTrains() {
    for (Train train : trains) System.out.println(train);
  }

  public void addManyTrains() {
    Random random = new Random();
    Train.Days[] values = Train.Days.values();
    trains = new Train[20];
    for (int i = 0; i < trains.length; i++) {
      if (i % 2 == 0)
        trains[i] = new Train(random.nextInt(102), "Vinnitsa", "Kyiv", " timeDispatch " + " + " + i, "timeArrival " + " + " + i, values[4]);
      else
        trains[i] = new Train(random.nextInt(12), "Vinnitsa", "Kyiv", " timeDispatch " + " + " + i, "timeArrival " + " + " + i, values[2]);
    }
  }

  public void searchTrain(String stationDispatch, String stationArrival, Train.Days day) {
    for (int i = 0; i < trains.length; i++) {
      if (trains[i].dayArrive == day &&
          trains[i].stationDispatch.equalsIgnoreCase(stationDispatch) &&
          trains[i].stationArrival.equalsIgnoreCase(stationArrival))
        System.out.println(trains[i]);
    }
  }


  static class Train {  // INNER CLASS ->
    // CONSTRUCTORS ->

    // constructor >number<
    public Train(int number) {
      this.number = number;
    }

    // constructor >ALL<
    public Train(int number, String stationDispatch, String stationArrival, String timeDispatch, String timeArrival, Days dayArrive) {
      this.number = number;
      this.stationDispatch = stationDispatch;
      this.stationArrival = stationArrival;
      this.timeDispatch = timeDispatch;
      this.timeArrival = timeArrival;
      this.dayArrive = dayArrive;
    }

    // FIELDS ->
    int number;
    String stationDispatch;
    String stationArrival;
    String timeDispatch;
    String timeArrival;
    Days dayArrive;

    enum Days {
      MONDAY,
      TUESDAY,
      WEDNESDAY,
      THURSDAY,
      FRIDAY,
      SATURDAY,
      SUNDAY
    }

    // GETTERS & SETTERS ->
    public int getNumber() {
      return number;
    }

    public Days getDayArrive() {
      return dayArrive;
    }

    public void setDayArrive(Days dayArrive) {
      this.dayArrive = dayArrive;
    }

    public void setNumber(int number) {
      this.number = number;
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

    @Override
    public String toString() {
      return "Train " +
          "N " + number +
          ", stationDispatch= " + stationDispatch +
          ", stationArrival= " + stationArrival +
          ", timeDispatch= " + timeDispatch +
          ", timeArrival= " + timeArrival +
          ", dayArrive=" + dayArrive;
    }
  }
}

class Main {
  public static void main(String[] args) {
    Laba_5_TrainSchedule trainSchedule = new Laba_5_TrainSchedule();
    trainSchedule.addTrain();
    trainSchedule.printAllTrains();
    trainSchedule.addManyTrains();
    trainSchedule.printAllTrains();
    System.out.println("============================================================================================");
    trainSchedule.searchTrain("Vinnitsa", "Kyiv", Laba_5_TrainSchedule.Train.Days.FRIDAY);

  }

  public static <T> int count(T[] anArray, T elem) {
    int cnt = 0;
    for (T e : anArray)
      if (e.equals(elem))
        ++cnt;
    return cnt;
  }
}