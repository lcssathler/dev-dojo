package maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        Locale japanLocale = Locale.JAPAN;
        Locale italyLocale = Locale.ITALY;
        Locale koreaLocale = Locale.KOREA;
        Locale usLocale = Locale.US;

        NumberFormat[] nfs = new NumberFormat[5];
        nfs[0] = NumberFormat.getCurrencyInstance(defaultLocale);
        nfs[1] = NumberFormat.getCurrencyInstance(japanLocale);
        nfs[2] = NumberFormat.getCurrencyInstance(italyLocale);
        nfs[3] = NumberFormat.getCurrencyInstance(koreaLocale);
        nfs[4] = NumberFormat.getCurrencyInstance(usLocale);

        double value = 1000.1234;

        for (NumberFormat nf : nfs) {
            System.out.println("Maximum Fraction Digits: " + nf.getMaximumFractionDigits());
            System.out.println("Currency: " + nf.format(value));
            System.out.println("-=".repeat(15));
        }

        String stringValue = "R$ 1.000,12";
        try {
            System.out.println(nfs[0].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
