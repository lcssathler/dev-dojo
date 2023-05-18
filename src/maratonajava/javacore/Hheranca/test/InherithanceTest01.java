package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.domain.Address;
import maratonajava.javacore.Hheranca.domain.Employee;
import maratonajava.javacore.Hheranca.domain.Person;

public class InherithanceTest01 {
    public static void main(String[] args) {
        Address address1 = new Address();
        Address address2 = new Address();
        address1.setStreetName("Carijo Street");
        address1.setZipCode(31620530);
        address2.setStreetName("Edimburgo Street");
        address2.setZipCode(21484544);

        Person person = new Person("Henri");
        person.setAge(21);
        person.setAddress(address1);
        person.setCpf(24561048);

        person.printPersonData();

        Employee employee1 = new Employee("August", 45);
        employee1.setCpf(21484562);
        employee1.setAddress(address2);
        employee1.setSalary(24000);
        Employee employee2 = new Employee("Ryan", 33);
        employee2.setCpf(784562147);
        employee2.setAddress(address1);
        employee2.setSalary(56380);

        employee1.printPersonData();
        employee1.payroll();
        employee2.printPersonData();
        employee2.payroll();


    }
}
