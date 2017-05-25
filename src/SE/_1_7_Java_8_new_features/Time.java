package SE._1_7_Java_8_new_features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

/**
 * Created by Garret on 16.05.2017.
 */
public class Time {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Now " + today);
        LocalDate birthday = LocalDate.of(1992, Month.JULY,02);
        System.out.println("Birthday " + birthday);

        ZoneId zone = ZoneId.of("Europe/Berlin");
        LocalTime time = LocalTime.now(zone);
        System.out.println("Berlin time " + time);
    }
}
