package maratonajava.javacore.Gassociacao.domain.domainexercise;

public class Student {
    private String name;
    private double age;
    private Seminar seminar;

    public Student(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
