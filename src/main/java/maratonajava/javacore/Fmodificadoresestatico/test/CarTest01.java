package maratonajava.javacore.Fmodificadoresestatico.test;

import maratonajava.javacore.Fmodificadoresestatico.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 273);
        Car car2 = new Car("Mercedes", 280);
        Car car3 = new Car("Audi", 297);

        Car.setLimitSpeed(170);

        car1.print();
        car2.print();
        car3.print();
    }
}
