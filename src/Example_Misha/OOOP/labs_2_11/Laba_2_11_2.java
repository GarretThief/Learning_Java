package OOP.labs_2_11;

public class Laba_2_11_2 {

  public static void main(String[] args) throws InterruptedException {

    try {

      dangerTest("Just for fun exception ))");

    } catch (HorrableException exception) {

      System.out.print("\nName of exception: ");
      System.out.printf("%30s", exception.getClass().getSimpleName());

      System.out.print("\nMessage in exception: ");
      System.out.printf("%30s", exception.getMessage() + "\n");

    }

    Thread.sleep(1111);

    Laba_2_11_2 labaTest = null;
    try {
      labaTest.dangerTest("test");
    } catch (HorrableException e) {
      System.out.println("\n");
      Thread.sleep(1111);
      e.printStackTrace();
    }

    Thread.sleep(1111);
    System.out.println("\n Its the end of class...");
  }//<end of main|

  // METHOD TEST>
  private static void dangerTest(String messagaForUra) throws HorrableException, InterruptedException {
    Thread.sleep(1111);
    throw new HorrableException(messagaForUra);
  }
}//<END of class|

// OTHER CLASS>>
class HorrableException extends Exception{
  HorrableException(String message) {
    super(message);
  }
}