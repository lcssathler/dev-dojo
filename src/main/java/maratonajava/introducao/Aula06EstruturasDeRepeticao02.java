package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprimir números pares de zero a um milhão
        for (int i=0; i<=1000; i++) {
            if (i % 2 == 0) {
                System.out.println("Número " + i);
            }
        }
        int cont = 0;
        while (cont <= 1000) {
            if (cont % 2 == 0) {
                System.out.println("Number " + cont);
            }
            cont++;
        }
    }
}
