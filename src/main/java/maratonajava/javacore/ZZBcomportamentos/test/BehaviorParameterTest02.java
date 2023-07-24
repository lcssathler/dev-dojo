package maratonajava.javacore.ZZBcomportamentos.test;

import maratonajava.javacore.ZZBcomportamentos.domain.Car;
import maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class BehaviorParameterTest02 {
    private static List<Car> cars = List.of(
        new Car("Green", 2012),
        new Car("Blue", 2022),
        new Car("Grey", 2013),
        new Car("Black", 2015)
);

    public static void main(String[] args) {
        System.out.println(filteredCars(cars, cars -> cars.getColor().equals("Green")));
        System.out.println(filteredCars(cars, cars -> cars.getColor().equals("Grey")));
        System.out.println(filteredCars(cars, cars -> cars.getYear() < 2015));
    }

    public static List<Car> filteredCars (List<Car> cars, CarPredicate predicate) {
        List<Car> filteredCarsBy = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCarsBy.add(car);
            }
        }
        return filteredCarsBy;
    }
}
