package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int cont = 0;
        while (cont <= 10) {
            System.out.println("While " + cont);
            cont++;
        }
        cont = 0;
        do {
            System.out.println("Código executado dentro do do-while " + cont);
            cont++;
        } while (cont <= 10);
        for (int i=0; i <= 10; i++) {
            System.out.println("For " + i);
        }
    }
}
