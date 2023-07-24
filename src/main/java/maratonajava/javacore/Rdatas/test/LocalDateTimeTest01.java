package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);

        LocalDate localDate = LocalDate.parse("2002-01-07");
        LocalTime localTime = LocalTime.parse("13:45:22");
        LocalDateTime ldt1 = localDate.atTime(23, 45, 32);
        LocalDateTime ldt2 = localTime.atDate(localDate);
        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
