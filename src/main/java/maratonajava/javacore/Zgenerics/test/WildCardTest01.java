package maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    abstract void consult();
}

class Cat extends Animal {
    @Override
    void consult() {
        System.out.println("Consulting cat");
    }
}

class Dog extends Animal {
    @Override
    void consult() {
        System.out.println("Consulting dog");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsult(dogs);
        printConsult(cats);
    }

    public static void printConsult(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
    }
}
