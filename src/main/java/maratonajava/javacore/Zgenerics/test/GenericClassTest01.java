package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.domain.Car;
import maratonajava.javacore.Zgenerics.service.ProfitableCarService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        ProfitableCarService profitableCarService = new ProfitableCarService();
        Car car = profitableCarService.retrieveAvailableCar();
        profitableCarService.retrieveRentedCar(car);
    }
}
