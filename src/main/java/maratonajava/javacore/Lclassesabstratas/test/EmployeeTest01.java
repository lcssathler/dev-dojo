package maratonajava.javacore.Lclassesabstratas.test;

import maratonajava.javacore.Lclassesabstratas.domain.Developer;
import maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Developer developer = new Developer("Aisha", 5000);
        Manager manager = new Manager("Jeremy", 10000);

        System.out.println(developer);
        System.out.println(manager);
        developer.printMsg();
        manager.printMsg();
    }
}
