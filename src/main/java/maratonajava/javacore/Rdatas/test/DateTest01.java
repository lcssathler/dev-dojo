package maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(1_000_000_000L);
        date2.setTime(date1.getTime() + 3_600_000L);

        System.out.println(date1);
        System.out.println(date2);
    }
}
