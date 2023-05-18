package maratonajava.javacore.Lclassesabstratas.domain;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void wageBonus() {
        this.salary = this.salary + this.salary * 0.1;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
