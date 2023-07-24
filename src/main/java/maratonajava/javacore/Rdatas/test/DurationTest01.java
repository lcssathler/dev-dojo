package maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        Duration duration1 = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.ofDays(10);
        Duration duration3 = Duration.ofHours(300);
        Duration duration4 = Duration.ofMinutes(65);
        Duration duration5 = Duration.ofSeconds(120);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);


    }
}
