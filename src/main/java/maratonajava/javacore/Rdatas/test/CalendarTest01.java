package maratonajava.javacore.Rdatas.test;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week!");
        }

        int dayMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Today is: " + dayMonth + " de " + month + " de " + year);
        System.out.println();

        System.out.println("Current Time: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 1);
        //calendar.add(Calendar.HOUR, 12);
        calendar.roll(Calendar.HOUR, 12);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
