package maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cat> cats = List.of(new Cat(), new Cat());
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Animal> animals = List.of(new Cat(), new Dog());
//        printConsult(cats);
//        printConsult(dogs);
        printConsult(animals);
    }

    public static void printConsult(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
    }
}
