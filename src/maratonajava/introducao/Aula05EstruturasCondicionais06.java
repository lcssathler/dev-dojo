package maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dado os valores de 1 a 7, imprima se será dia útil ou fim de semana
        //Considerando 1 como domingo
        //Using switch
        byte weekDay = 7;
        switch (weekDay) {
            case 7:
            case 1:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}
