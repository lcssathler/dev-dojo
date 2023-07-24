package maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        ZonedDateTime zone = ZonedDateTime.now();
        String format1 = zone.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = zone.format(DateTimeFormatter.ISO_DATE);
        String format3 = zone.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String format4 = zone.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
        System.out.println(format4);
        System.out.println();

        LocalDate parse1 = LocalDate.parse("20020107", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("1987-11-13", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2014-09-27", DateTimeFormatter.ISO_LOCAL_DATE);
        ZonedDateTime parse4 = ZonedDateTime.parse("2023-05-09T16:56:59.3134346-03:00[America/Sao_Paulo]", DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        System.out.println(parse4);
        System.out.println();

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        LocalDate parseBR = LocalDate.parse("09/05/2023", formatterBR);

        System.out.println(formatBR);
        System.out.println(parseBR);
        System.out.println();

        DateTimeFormatter formatterJapan = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.JAPAN);
        String formatJapan = LocalDate.now().format(formatterJapan);
        LocalDate parseJapan = LocalDate.parse("09/5月/2023", formatterJapan);

        System.out.println(formatJapan);
        System.out.println(parseJapan);
    }
}
