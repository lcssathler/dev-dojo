package maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cat> cats = List.of(new Cat(), new Cat());
        List<Dog> dogs = List.of(new Dog(), new Dog());
        printConsultExtends(cats);
        printConsultExtends(dogs);

        List<Animal> animals = new ArrayList();
        printConsultSuper(animals);
    }

    public static void printConsultExtends(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
    }

    public static void printConsultSuper(List<? super Animal> animals) {
        for (Object animal : animals) {
            System.out.println(animal);
        }
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
