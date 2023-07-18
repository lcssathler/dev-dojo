package maratonajava.javacore.ZZHdesignpatterns.test;

import maratonajava.javacore.ZZHdesignpatterns.domain.Country;
import maratonajava.javacore.ZZHdesignpatterns.domain.Currency;
import maratonajava.javacore.ZZHdesignpatterns.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        CurrencyFactory currencyFactory = new CurrencyFactory();
        Currency currency = currencyFactory.getCurrency(Country.USA);
        System.out.println(currency.getSymbol());
    }
}
