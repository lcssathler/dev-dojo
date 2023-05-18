package maratonajava.javacore.Jmodificadorfinal.domain;

public class Car {
    private String carName;
    public static final double MAX_SPEED = 210;
    public final Purchaser PURCHASER = new Purchaser();

    public void print() {
        System.out.println(this.carName);
    }
    public Purchaser getPURCHASER() {
        return PURCHASER;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
