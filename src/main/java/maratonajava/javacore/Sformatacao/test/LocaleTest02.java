package maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        String[] isoLanguages = Locale.getISOLanguages();
        String[] isoCountries = Locale.getISOCountries();

        System.out.println(localeDefault);
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " - ");
        }
        System.out.println();
        System.out.println("-=".repeat(40));
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " - ");
        }
    }
}
