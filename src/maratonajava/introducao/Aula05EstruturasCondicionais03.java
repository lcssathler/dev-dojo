package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        int goalsFlamengo = 3;
        int goalsVasco = 7;
        String resultado;
        resultado = (goalsFlamengo > goalsVasco) ? "Flamengo Vence!" : goalsFlamengo == goalsVasco ? "Empate!" : "Flamengo perde!";

        System.out.println(resultado);
    }
}
