package maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(now);
        System.out.println(ldt);

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
    }
}
