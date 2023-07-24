package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Product;
import maratonajava.javacore.Npolimorfismo.domain.Shoe;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product1 = new Shoe("Adidas Running", 500);

        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.taxCalculator());
    }
}
