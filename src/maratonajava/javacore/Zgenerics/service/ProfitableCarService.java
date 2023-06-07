package maratonajava.javacore.Zgenerics.service;

import maratonajava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ProfitableCarService {

    private List<Car> availableCars = new ArrayList<>(
            List.of(new Car("Jaguar"), new Car("Porsche")));

    public Car retrieveAvailableCar () {
        System.out.println("Retrieving availables cars...");
        Car car = availableCars.remove(0);
        System.out.println("Renting car: " + car);
        System.out.println("Available cars to rent: " + availableCars);
        return car;
    }

    public void retrieveRentedCar(Car car) {
        System.out.println("Returning car " + car);
        availableCars.add(car);
        System.out.println("Available cars to rent: " + availableCars);
    }
}
