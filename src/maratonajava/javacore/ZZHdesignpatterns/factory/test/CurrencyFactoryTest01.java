package maratonajava.javacore.ZZHdesignpatterns.factory.test;

import maratonajava.javacore.ZZHdesignpatterns.factory.domain.Country;
import maratonajava.javacore.ZZHdesignpatterns.factory.domain.Currency;
import maratonajava.javacore.ZZHdesignpatterns.factory.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        CurrencyFactory currencyFactory = new CurrencyFactory();
        Currency currency = currencyFactory.getCurrency(Country.USA);
        System.out.println(currency.getSymbol());
    }
}
