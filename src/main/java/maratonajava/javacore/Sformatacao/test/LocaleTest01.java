package maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale brazilLocale = new Locale("pt", "BR");
        Locale portugalLocale = new Locale("pt", "PT");
        Locale japanLocale = new Locale("ja", "JP");
        Locale italyLocale = new Locale("it", "IT");
        Locale switzerlandLocale = new Locale("it", "CH");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 =  DateFormat.getDateInstance(DateFormat.FULL, brazilLocale);
        DateFormat df2 =  DateFormat.getDateInstance(DateFormat.FULL, portugalLocale);
        DateFormat df3 =  DateFormat.getDateInstance(DateFormat.FULL, japanLocale);
        DateFormat df4 =  DateFormat.getDateInstance(DateFormat.FULL, italyLocale);
        DateFormat df5 =  DateFormat.getDateInstance(DateFormat.FULL, switzerlandLocale);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(df4.format(calendar.getTime()));
        System.out.println(df5.format(calendar.getTime()));
        System.out.println();

        System.out.println(brazilLocale.getDisplayCountry(japanLocale));
        System.out.println(japanLocale.getDisplayLanguage(italyLocale));
        System.out.println(portugalLocale.getDisplayName(switzerlandLocale));
    }
}
