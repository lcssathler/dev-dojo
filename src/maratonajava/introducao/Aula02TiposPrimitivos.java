package maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args) {
        byte numByte = 44;
        short smallNum = 1;
        int age = 10;
        long bigNum = 234235342;
        float realNum = 34;
        double doublePrice = 100000;
        boolean isWoman = true;
        char character= '\u0041';

        int castingInt = (int) 100000000000L;
        long castingLong = (long) 155.54D;

        String nome = "Lucas";

        System.out.println("A idade é " + age + " anos");
        System.out.println(castingInt);
        System.out.println(castingLong);
        System.out.println("Olá, meu nome é " + nome + "!");
    }
}
