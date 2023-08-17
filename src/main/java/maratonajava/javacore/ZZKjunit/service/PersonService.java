package maratonajava.javacore.ZZKjunit.service;

import maratonajava.javacore.ZZKjunit.domain.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    public boolean isAdult(Person person) {
//        Objects.requireNonNull(person, "Person object can't be null");
        if (person == null) {
            throw new NullPointerException();
        }
        return person.getAge() >= 18;
    }

    public List<Person> filterRemoveNotAdult(List<Person> personList) {
        final PersonService personService = new PersonService();
        return personList.stream().filter(this::isAdult).collect(Collectors.toList());
    }
}