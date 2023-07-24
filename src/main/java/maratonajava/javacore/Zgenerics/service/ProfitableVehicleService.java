package maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class ProfitableVehicleService<T> {
    private List<T> availableVehicles;

    public ProfitableVehicleService(List<T> availableVehicles) {
        this.availableVehicles = availableVehicles;
    }

    public T retrieveAvailableVehicle() {
        System.out.println("Retrieving availables vehicles...");
        T vehicle = availableVehicles.remove(0);
        System.out.println("Renting vehicle: " + vehicle);
        System.out.println("Available vehicles to rent: " + availableVehicles);
        return vehicle;
    }

    public void returnRentedVehicle (T vehicle) {
        System.out.println("Returning vehicle " + vehicle);
        availableVehicles.add(vehicle);
        System.out.println("Available vehicles to rent: " + availableVehicles);
    }
}
