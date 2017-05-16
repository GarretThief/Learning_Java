package OOP.labs_2_13;

import java.util.Arrays;

public class Laba_2_And_Laba_3 {
  enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public WeekDays nextDay() {
      WeekDays[] values = WeekDays.values();
      int ordinal = this.ordinal();
      return ++ordinal == values.length ? MONDAY : values[ordinal];
    }
  }

  public static void main(String[] args) {

    System.out.println(Arrays.toString(WeekDays.values()));
    System.out.println("Here are my java days: ");
    for (WeekDays day : WeekDays.values())
      printOnlyJavaDays(day);
  }

  private static void printOnlyJavaDays(WeekDays day) {
    switch (day) {
      case TUESDAY:
        System.out.println("WEDNESDAY -- is a JAVA day!");
        System.out.println("The next day of week: " + WeekDays.TUESDAY.nextDay());
        break;
      case THURSDAY:
        System.out.println("THURSDAY -- is a JAVA day!");
        System.out.println("The next day of week: " + WeekDays.THURSDAY.nextDay());
        break;
    }
  }
}
