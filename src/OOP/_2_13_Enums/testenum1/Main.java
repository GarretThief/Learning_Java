package OOP._2_13_Enums.testenum1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Create a enum type MyDayOfWeek which specify a days-of-the-week (SUNDAY, MONDAY, …).
    enum MyDayOfWeek {
        SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
        SATURDAY(7);

        private int numberOfDay;

        MyDayOfWeek(int dayNumber) {
            this.numberOfDay = dayNumber;
        }

        public int getNumberOfDay() {
            return this.numberOfDay;
        }

        /* Rewrite MyDayOfWeek enum, add method nextDay() which return the next day of week on for given enum value.
         * For example: MyDayOfWeek.FRIDAY.nextDay() must return MyDayOfWeek.SATURDAY. */
        public MyDayOfWeek nextDay() {
            switch (getNumberOfDay()) {
                case 1:
                    return MONDAY;
                case 2:
                    return TUESDAY;
                case 3:
                    return WEDNESDAY;
                case 4:
                    return THURSDAY;
                case 5:
                    return FRIDAY;
                case 6:
                    return SATURDAY;
                case 7:
                    return SUNDAY;
            }
            return this;
        }
    }

        /* Add to method main() code that iterate over MyDayOfWeek enum possible values in loop and using switch statement
         * print to console days of the week only when you have classes in Java Programming. */
    public static void getMyJavaDays (MyDayOfWeek [] myDays){
        System.out.println("My Java Days:");
        for (MyDayOfWeek myJavaDay : myDays) {
            switch (myJavaDay){
                case TUESDAY:
                    System.out.println(myJavaDay);
                    break;
                case THURSDAY:
                    System.out.println(myJavaDay);
                    break;
                case SATURDAY:
                    System.out.println(myJavaDay);
                    break;
            }
        }
        System.out.println();
    }



    public static void main(String[] args) {
        /* Add to method main() code that iterate over MyDayOfWeek enum possible values in loop
         * and print each value name to console. */
        System.out.println(Arrays.toString(MyDayOfWeek.values()) + "\n");

        // Print to console days of the week only when you have classes in Java Programming.
        getMyJavaDays(MyDayOfWeek.values());

        /* Add to method main() code that read string value from console (using System.in and Scanner),
         * then you must parse string value to particular enum value (using valueOf() method) and
         * then print the name of next day of week to console.*/
        Scanner scanDay = new Scanner(System.in);
        System.out.print("Enter name of Day: ");
        MyDayOfWeek myDay = MyDayOfWeek.valueOf(scanDay.nextLine().toUpperCase());
        System.out.println("Next day of week: " + myDay.nextDay());


    }
}

