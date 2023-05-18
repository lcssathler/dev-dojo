package maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        wageBonus();
    }

    @Override
    public void printMsg() {
        System.out.println("Printing...");
    }

    public abstract void wageBonus();
}
