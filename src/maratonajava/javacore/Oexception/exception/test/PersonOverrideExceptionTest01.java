package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.domain.Employee;
import maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;
import maratonajava.javacore.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonOverrideExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            person.save();
            employee.save();
        } catch (InvalidLoginException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
