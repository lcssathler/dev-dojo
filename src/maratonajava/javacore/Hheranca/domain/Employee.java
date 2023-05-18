package maratonajava.javacore.Hheranca.domain;

public class Employee extends Person{
    private double salary;

    static {
        System.out.println("Inside Employee's initialization static block");
    }

    {
        System.out.println("Inside Employee's initialization block");
    }
    public Employee(String name, int age) {
        super(name, age);
        System.out.println("Inside Employee's constructor");
    }

    public void printPersonData() {
        super.printPersonData();
        System.out.println("Salary: " + this.salary);
        System.out.println();
    }

    public void payroll() {
        System.out.println("---- Inside Employee Class ----");
        System.out.println("Eu, " + super.getName() + " recebo " + "RS" + this.salary);
        System.out.println();
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this    .salary = salary;
    }
}
