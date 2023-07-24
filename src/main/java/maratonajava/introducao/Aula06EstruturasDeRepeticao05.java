package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double carPrice = 10000;
        for (int i = (int) carPrice; i >= 1 ; i--) {
            double installment = carPrice / i;
            if (installment < 1000) {
                continue;
            }
            System.out.println(i + "x = " + installment);
        }
    }
}
