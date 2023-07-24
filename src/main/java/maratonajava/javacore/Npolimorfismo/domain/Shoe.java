package maratonajava.javacore.Npolimorfismo.domain;

public class Shoe extends  Product{
    public static final double SHOE_TAX = 0.15;
    private String manufacturingDate = "05/03/2022";

    public Shoe(String name, double price) {
        super(name, price);
    }

    @Override
    public double taxCalculator() {
        return this.price * SHOE_TAX;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
}
