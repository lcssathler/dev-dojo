package maratonajava.javacore.ZZKjunit.service;

import maratonajava.javacore.ZZKjunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private final PersonService personService = new PersonService();

    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(17);
    }

    @Test
    @DisplayName("A person shouldn't be adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }
    @Test
    @DisplayName("A person should be adult when age is greater or equals than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException when person is null")
    void isAdult_throwNullPointerException_WhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null), "Person can't be null!");
    }

    @Test
    @DisplayName("Should return a list with adults")
    void filterRemoveNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(19);
        List<Person> personList = List.of(person1, person2, person3);
        Assertions.assertEquals(2, personService.filterRemoveNotAdult(personList).size());
    }
}