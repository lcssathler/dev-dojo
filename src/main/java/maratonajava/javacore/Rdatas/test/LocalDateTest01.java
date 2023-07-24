package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate dateBirthday = LocalDate.of(2002, Month.JANUARY, 7);
        int yearBirthday = dateBirthday.getYear();
        String monthBirthday = dateBirthday.getMonth().toString().toLowerCase();
        int dayBirthday = dateBirthday.getDayOfMonth();
        System.out.println("Date of my Birthday: " + dayBirthday + "/" + monthBirthday + "/" + yearBirthday);

        LocalDate dateNow = LocalDate.now();
        dateNow = dateNow.plusYears(4);
        int dayNow = dateNow.getDayOfMonth();
        Month monthNow = dateNow.getMonth();
        int yearNow = dateNow.getYear();
        System.out.println("Date now: " + dateNow);
        System.out.println("Today is " + dayNow + "/" + monthNow + "/" + yearNow);
        System.out.println();

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.EPOCH);
        System.out.println(monthNow.getValue());
        System.out.println(dateNow.get(ChronoField.YEAR_OF_ERA));
        System.out.println(dateNow.getLong(ChronoField.MONTH_OF_YEAR));
    }
}
