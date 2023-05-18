package maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.util.Map;
import java.util.Set;

public class ZoneTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZoneId parisZone = ZoneId.of("Europe/Paris");
        LocalDateTime ldt = LocalDateTime.now(parisZone);
        System.out.println("Date time now: " + now);
        System.out.println(ZoneId.systemDefault());
        System.out.println(parisZone);
        System.out.println(ldt);
        System.out.println();

        ZonedDateTime zonedDateTime1 = now.atZone(parisZone);
        System.out.println( zonedDateTime1);
        Instant instantNow = Instant.now();
        System.out.println(instantNow);
        ZonedDateTime zonedDateTime2 = instantNow.atZone(parisZone);
        System.out.println(zonedDateTime2);
        System.out.println();

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);
        ZoneOffset manausOffset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(manausOffset);
        OffsetDateTime offsetDateTime2 = instantNow.atOffset(manausOffset);
        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println();

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        LocalDate meijiEra = LocalDate.of(1899, 11, 23);
        JapaneseDate meiji = JapaneseDate.from(meijiEra);
        System.out.println(japaneseDate);
        System.out.println(meiji);


    }
}
