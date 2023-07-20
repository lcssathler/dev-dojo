package maratonajava.javacore.ZZHdesignpatterns.dto.test;

import maratonajava.javacore.ZZHdesignpatterns.builder.domain.Person;
import maratonajava.javacore.ZZHdesignpatterns.dto.domain.DataTransferObject;
import maratonajava.javacore.ZZHdesignpatterns.factory.domain.Country;
import maratonajava.javacore.ZZHdesignpatterns.factory.domain.Currency;
import maratonajava.javacore.ZZHdesignpatterns.factory.domain.CurrencyFactory;
import maratonajava.javacore.ZZHdesignpatterns.singleton.domain.AircraftSingletonEager;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        AircraftSingletonEager aircraft = AircraftSingletonEager.getInstance();
        Person person = new Person.PersonBuilder().name("Lucas").lastName("Sathler").build();
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.getCurrency(country);
    }
}
