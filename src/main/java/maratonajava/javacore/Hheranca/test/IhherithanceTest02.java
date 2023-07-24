package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.domain.Employee;

/*
* 1º Superclass's initialization static block is executed when JVM loads superclass
* 2º Subclass's initialization static block is executed when JVM loads subclass
* 3º Alocating memory space for the superclass's object
* 4º Creating the attributes of superclass and initializing with default values
* 5º Superclass's initialization block is executed
* 6º Superclass's constructor is executed
* 7º Alocating memory space for the subclass's object
* 8º Creating the attributes of subclass and initializing with default values
* 9º Subclass's initialization block is executed
* 10ºSubclass's constructor is executed */

public class IhherithanceTest02 {
    public static void main(String[] args) {
        Employee employee = new Employee("Louis", 43);
    }
}
