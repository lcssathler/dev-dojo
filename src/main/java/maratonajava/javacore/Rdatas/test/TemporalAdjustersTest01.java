package maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Date time now: " + now);
        LocalDateTime newDay = now.plusDays(30);
        now = now.withDayOfMonth(30);

        System.out.println("New date time with plusDays(): " + newDay);
        System.out.println("New date time with withDayOfMonth(): " + now);
        System.out.println();

        now = LocalDateTime.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println();

        now = LocalDateTime.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
