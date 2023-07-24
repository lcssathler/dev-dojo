package maratonajava.javacore.ZZBcomportamentos.test;

import maratonajava.javacore.ZZBcomportamentos.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorParameterTest01 {
    private static List<Car> cars = List.of(
            new Car("Green", 2012),
            new Car("Blue", 2022),
            new Car("Grey", 2013),
            new Car("Black", 2015)
    );

    public static void main(String[] args) {
        System.out.println(filteredGreenCars(cars));
        System.out.println(filteredManufacturedCars(cars));
    }

    public static List<Car> filteredGreenCars (List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    public static List<Car> filteredManufacturedCars (List<Car> cars) {
        List<Car> carsBefore2015 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < 2015) {
                carsBefore2015.add(car);
            }
        }
        return carsBefore2015;
    }
}
