package maratonajava.javacore.Hheranca.domain;

import java.sql.SQLOutput;

public class Person extends Object {
    protected String name;
    protected int age;
    protected long cpf;
    protected Address address;

    static {
        System.out.println("Inside Person's initialization static blocks");
    }

    {
        System.out.println("Inside Person's initialization blocks");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("Inside Person's constructor");
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("Inside Person's constructor");
    }

    public void printPersonData () {
        System.out.println("---- Inside Person Class ----");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Address: " + this.address.getStreetName());
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
