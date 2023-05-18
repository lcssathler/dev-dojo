package maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }
    public void subtrairDoisNumeros() {
        System.out.println(20 - 5);
    }

    public void multiplicarNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividirNumeros(double divisor, double dividendo) {
        if (dividendo == 0) {
            return 0;
        } else {
            return divisor / dividendo;
        }
    }
    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do método alteraDois Numeros()");
        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
    }

    public void somaNumeros (int arg1, int arg2, int...numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println("Soma total: " + soma);
    }
}
