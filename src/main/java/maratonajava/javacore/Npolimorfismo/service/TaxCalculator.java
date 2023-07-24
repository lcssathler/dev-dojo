package maratonajava.javacore.Npolimorfismo.service;

import maratonajava.javacore.Npolimorfismo.domain.Pc;
import maratonajava.javacore.Npolimorfismo.domain.Product;
import maratonajava.javacore.Npolimorfismo.domain.Shoe;

public class TaxCalculator {
    public static void taxCalculator (Product product) {
        double tax = product.taxCalculator();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Product Tax: " + tax);

        if (product instanceof Shoe) {
            Shoe shoe = (Shoe) product;
            System.out.println("Manufacturing Date: " + shoe.getManufacturingDate());
        }
    }
}
