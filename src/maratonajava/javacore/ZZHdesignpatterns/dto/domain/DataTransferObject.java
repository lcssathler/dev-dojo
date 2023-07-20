package maratonajava.javacore.ZZHdesignpatterns.dto.domain;

import maratonajava.javacore.ZZHdesignpatterns.factory.domain.Country;
import maratonajava.javacore.ZZHdesignpatterns.singleton.domain.AircraftSingletonEager;
import maratonajava.javacore.ZZHdesignpatterns.builder.domain.Person;

import java.util.Currency;

public class DataTransferObject {
    private AircraftSingletonEager aircraft;
    private Country country;
    private Currency currency;
    private Person person;

    public static final class DataTransferObjectBuilder {
        private AircraftSingletonEager aircraft;
        private Person person;
        private Country country;
        private Currency currency;

        private DataTransferObjectBuilder() {
        }

        public static DataTransferObjectBuilder builder() {
            return new DataTransferObjectBuilder();
        }

        public DataTransferObjectBuilder withAircraft(AircraftSingletonEager aircraft) {
            this.aircraft = aircraft;
            return this;
        }

        public DataTransferObjectBuilder withPerson(Person person) {
            this.person = person;
            return this;
        }

        public DataTransferObjectBuilder withCountry(Country country) {
            this.country = country;
            return this;
        }

        public DataTransferObjectBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public DataTransferObject build() {
            DataTransferObject dataTransferObject = new DataTransferObject();
            dataTransferObject.aircraft = this.aircraft;
            dataTransferObject.country = this.country;
            dataTransferObject.currency = this.currency;
            dataTransferObject.person = this.person;
            return dataTransferObject;
        }
    }
}
