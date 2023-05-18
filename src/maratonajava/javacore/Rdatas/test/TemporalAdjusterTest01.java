package maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 5, 15);
        System.out.println("The next business day is: " + nextBusinessDay(date));
    }

    public static LocalDate nextBusinessDay (LocalDate date) {
        int intDayWeek = date.getDayOfWeek().getValue();

        if (intDayWeek == 4 || intDayWeek == 5 || intDayWeek == 6 || intDayWeek == 7) {
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        } else {
            date = date.plusDays(1);
        }
        return date;
    }
}
