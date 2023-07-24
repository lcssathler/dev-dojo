package maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class ReadingInputsTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = input.nextLine();

        System.out.print("Digite a sua idade: ");
        double age = input.nextDouble();

        System.out.print("Digite o seu sexo [M/F]: ");
        String sex = input.next().toUpperCase();
        char newSex = sex.charAt(0);
        while ((newSex != 'M') && (newSex != 'F')) {
            System.out.print("Resposta inválida! Tente novamente [M/F]: ");
            sex = input.next().toUpperCase();
            newSex = sex.charAt(0);
        }

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Sexo: " + sex);
    }
}

