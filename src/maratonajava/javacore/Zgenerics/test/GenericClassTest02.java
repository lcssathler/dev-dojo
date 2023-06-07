package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.domain.Boat;
import maratonajava.javacore.Zgenerics.domain.Car;
import maratonajava.javacore.Zgenerics.service.ProfitableVehicleService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest02 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(
                        List.of(new Car("BMW"), new Car("Ferrari")));
        List<Boat> boats = new ArrayList<>(
                        List.of(new Boat("Motorboat"), new Boat("Yacht")));

        ProfitableVehicleService vehicleService = new ProfitableVehicleService<>(cars);
        Object vehicle = vehicleService.retrieveAvailableVehicle();
        vehicleService.returnRentedVehicle(vehicle);

        System.out.println("\n" + "-=".repeat(35));

        ProfitableVehicleService vehicleService2 = new ProfitableVehicleService<>(boats);
        Object vehicle2 = vehicleService.retrieveAvailableVehicle();
        vehicleService.returnRentedVehicle(vehicle2);
    }
}
