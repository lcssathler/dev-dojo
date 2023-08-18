package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Pc;
import maratonajava.javacore.Npolimorfismo.domain.ProductTax;
import maratonajava.javacore.Npolimorfismo.domain.Shoe;
import maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class
ProductTest01 {
    public static void main(String[] args) {
        Pc pc = new Pc("Nitro Turbo 5", 6500);
        Shoe shoe = new Shoe("Adidas Running 4", 480);

        TaxCalculator.taxCalculator(pc);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        TaxCalculator.taxCalculator(shoe);
    }
}
