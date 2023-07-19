package maratonajava.javacore.ZZHdesignpatterns.factory.domain;

public class CurrencyFactory {
    public Currency getCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsaSign();
            case BRAZIL:
                return new RealSign();
            default:  throw new IllegalArgumentException("No currency found for this country!");
        }
    }
}
