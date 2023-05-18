package maratonajava.javacore.Jmodificadorfinal.test;

import maratonajava.javacore.Jmodificadorfinal.domain.Car;
import maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;
import maratonajava.javacore.Jmodificadorfinal.domain.Purchaser;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setCarName("Civic");
        car2.setCarName("Supra");

        System.out.println("Car name: " + car1.getCarName());
        System.out.println("Max Speed: " + Car.MAX_SPEED);
        car1.PURCHASER.setName("Elvis");
        System.out.println("Purchaser: " + car1.getPURCHASER());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");

        System.out.println("Car name: " + car2.getCarName());
        System.out.println("Max Speed: " + Car.MAX_SPEED);
        car2.PURCHASER.setName("Maximus");
        System.out.println("Purchaser: " + car2.getPURCHASER().getName());

        Ferrari ferrari = new Ferrari();
        ferrari.setCarName("Zafira");
        ferrari.print();
    }
}
