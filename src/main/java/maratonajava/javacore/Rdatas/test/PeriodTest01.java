package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
        Period period1 = Period.between(now, nowAfterTwoYears);
        Period period2 = Period.of(2, 5, 10);
        Period period3 = Period.ofDays(7);
        Period period4 = Period.ofMonths(1);
        Period period5 = Period.ofWeeks(52);
        Period period6 = Period.ofYears(2002);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
        System.out.println(period6);

        System.out.println(now.until(now.plusDays(period5.getDays()), ChronoUnit.DAYS));
    }
}
