package maratonajava.javacore.ZZKjunit.service;

import maratonajava.javacore.ZZKjunit.domain.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person) {
        Objects.requireNonNull(person, "Person object can't be null");
        return person.getAge() >= 18;
    }
}
