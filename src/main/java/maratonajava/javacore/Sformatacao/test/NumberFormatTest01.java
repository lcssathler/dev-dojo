package maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        Locale japanLocale = Locale.JAPAN;
        Locale italyLocale = Locale.ITALY;
        Locale koreaLocale = Locale.KOREA;
        Locale usaLocale = Locale.US;

        NumberFormat[] nfs = new NumberFormat[5];
        nfs[0] = NumberFormat.getInstance(defaultLocale);
        nfs[1] = NumberFormat.getInstance(japanLocale);
        nfs[2] = NumberFormat.getInstance(italyLocale);
        nfs[3] = NumberFormat.getInstance(koreaLocale);
        nfs[4] = NumberFormat.getInstance(usaLocale);

        double value = 1000000.1234;
        String stringValue = "1000.450";

        for (NumberFormat nf : nfs) {
            String symbol = nf.getCurrency().getSymbol();
            System.out.println(symbol + ": " + nf.format(value));
            System.out.println("=-".repeat(15));
        }

        String symbol = nfs[4].getCurrency().getSymbol();
        try {
            System.out.println(symbol + ": " + nfs[4].parse(stringValue));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
