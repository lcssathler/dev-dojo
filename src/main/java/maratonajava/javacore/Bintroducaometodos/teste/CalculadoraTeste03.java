package maratonajava.javacore.Bintroducaometodos.teste;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirNumeros(3, 4);
        System.out.println(result);
    }
}
