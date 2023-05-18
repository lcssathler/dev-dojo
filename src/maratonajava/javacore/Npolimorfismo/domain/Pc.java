package maratonajava.javacore.Npolimorfismo.domain;

public class Pc extends Product{
    public static final double PC_TAX = 0.20;
    public Pc(String name, double price) {
        super(name, price);
    }

    @Override
    public double taxCalculator() {
        return this.price * PC_TAX;
    }
}
