package maratonajava.javacore.ZZBcomportamentos.test;

import maratonajava.javacore.ZZBcomportamentos.domain.Car;
import maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterTest03 {
    private static List<Car> cars = List.of(
        new Car("Green", 2012),
        new Car("Blue", 2022),
        new Car("Grey", 2013),
        new Car("Black", 2015)
);
    private static List<Integer> numbers = List.of(1,2,4,5,10);

    public static void main(String[] args) {
        System.out.println(filteredCars(cars, cars -> cars.getColor().equals("Green")));
        System.out.println(filteredCars(cars, cars -> cars.getColor().equals("Grey")));
        System.out.println(filteredCars(cars, cars -> cars.getYear() < 2015));

        System.out.println(filteredCars(numbers, (Integer nums) -> nums % 2 == 0));
    }

    public static <T> List<T> filteredCars (List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}
