package maratonajava.javacore.Fmodificadoresestatico.domain;

public class Car {
    private String carModel;
    private double maxSpeed;
    private static double limitSpeed = 250;
    public Car(String carModel, double maxSpeed) {
        this.carModel = carModel;
        this.maxSpeed = maxSpeed;
    }
    public void print() {
        System.out.println("-------------");
        System.out.println("Nome do carro: " + this.carModel);
        System.out.println("Velocidade Máxima: " + this.maxSpeed);
        System.out.println("Velocidade Limite: " + Car.limitSpeed);
        System.out.println();
    }
    public static void setLimitSpeed(double limitSpeed) {
        Car.limitSpeed = limitSpeed;
    }
    public static double getLimitSpeed() {
        return Car.limitSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
