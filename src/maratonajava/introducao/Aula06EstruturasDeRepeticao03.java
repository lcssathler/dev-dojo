package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Número " + i);
            if (i == 25) {
                System.out.println("Fim do Programa!");
                break;
            }
        }
    }
}
