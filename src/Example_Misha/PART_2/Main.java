package Example_Misha.PART_2;


import java.util.List;
import java.util.Scanner;

public class Main {
  private static InstructorManager manager = InstructorManager.getInstance();
  private static String fileName = "INSTRUCTORS.list";

  public static void main(String[] args) {
    System.out.println("ADD NEW Instructor ? [y/n]\n");
    String line = new Scanner(System.in).nextLine();
    if (line.equalsIgnoreCase("y")) addNewInstructor();
    else readFromFile();
  }

  private static void readFromFile() {
    List<Instructor> instructorsFromFile = manager.getFromFile(fileName);
    if (instructorsFromFile == null) System.out.println("shit happen...");
    else instructorsFromFile.forEach(System.out::println);
  }

  private static void addNewInstructor() {

    Instructor instructorMike = new Instructor("Mike", "Fisher", 30, true);
    boolean saveToFile = manager.saveToFile(instructorMike, fileName);
    System.out.println("save To File Mike -> " + saveToFile);

    Instructor instructorTom = new Instructor("Tom", "Tomas", 33, false);
    saveToFile = manager.saveToFile(instructorTom, fileName);
    System.out.println("save To File Tom -> " + saveToFile);
  }
}