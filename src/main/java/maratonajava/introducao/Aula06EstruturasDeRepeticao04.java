package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes pode ser parcelado
        //Condição: valorParcela >= 1000
        double valorCarro = 10000;
        for (int i = 1; i < valorCarro; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                System.out.println("Fim do programa! ");
                break;
            }
            System.out.println(i + "x = " + valorParcela);
        }
    }
}
