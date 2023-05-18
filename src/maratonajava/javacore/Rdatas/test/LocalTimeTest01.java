package maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime newTime = LocalTime.of(23, 45, 59);
        System.out.println(newTime.getHour());
        System.out.println(newTime.getMinute());
        System.out.println(newTime.getSecond());

        newTime = newTime.plusHours(2);
        System.out.println(newTime);
        System.out.println();

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

    }
}
