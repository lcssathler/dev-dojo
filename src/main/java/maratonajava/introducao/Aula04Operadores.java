package maratonajava.introducao;

public class Aula04Operadores{
    public static void main(String[] args) {
        //Aritméticos: + - * /
        int number1 = 10;
        int number2 = 20;
        double resultado = number1 / (double) number2;

        System.out.println("Valor " + number2 + number1);
        System.out.println(number2 + number1 + " Valor " + number2 + number1);
        System.out.println(resultado);

        //Relacionais: < > == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte = " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte = " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte = " + isDezIgualVinte);
        System.out.println("isDezIgualDez = " + isDezIgualDez);
        System.out.println("isDezDiferenteVinte = " + isDezDiferenteVinte);

        //Lógicos: &&(AND) || (OR) ! (NOT)
        int myAge = 29;
        boolean isHaveCar = true;
        boolean isCanDrive = myAge >= 18 && isHaveCar;
        System.out.println("Can I Drive? = " + isCanDrive);

        double currentAccount = 1680;
        double savings = 14000;
        double playstationPrice = 5000;
        boolean isCanBuyPlaystation = currentAccount > playstationPrice || savings > playstationPrice || currentAccount + savings > playstationPrice;
        System.out.println("Can I Buy a Playstation? = " + isCanBuyPlaystation);


        //Aritmeticos = += -= *= /= %=
        double bonus = 200;
        bonus += 100;
        bonus -= 100;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("Seu bônus é de " + bonus);

        //Incremento ++ --
        int contador = 0;
        System.out.println(contador++);
        System.out.println(contador);

        int contador2 = 10;
        System.out.println(++contador2);
        System.out.println(contador2);
    }
}
