package maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args) {
        int age = 15;
        boolean isaAllowedBuyAlcohol = age >= 18;
        System.out.println("Eu posso comprar álcool = " + isaAllowedBuyAlcohol);

        //!
        if (isaAllowedBuyAlcohol) {
            System.out.println("Autorizado a comprar álcool.");
        }
        else {
            System.out.println("Não está autorizado a comprar álcool.");
        }
        if (!isaAllowedBuyAlcohol) {
            System.out.println("Você NÃO está autorizado a comprar álcool.");
        }
    }
}
