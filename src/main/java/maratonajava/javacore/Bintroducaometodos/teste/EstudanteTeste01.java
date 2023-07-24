package maratonajava.javacore.Bintroducaometodos.teste;

import maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import maratonajava.javacore.Bintroducaometodos.dominio.ImprimirEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante student1 = new Estudante();
        Estudante student2 = new Estudante();
        ImprimirEstudante impressora = new ImprimirEstudante();

        student1.nome = "Goku";
        student1.idade = 33;
        student1.sexo = 'M';

        student2.nome = "Bulma";
        student2.idade = 45;
        student2.sexo = 'F';

        impressora.imprime(student1);
        impressora.imprime(student2);

        System.out.println("Dentro da classe EstudanteTeste01:");
        System.out.println(student1.nome);
        System.out.println(student1.idade);
        System.out.println(student1.sexo);
        System.out.println("-------------");

        System.out.println(student2.nome);
        System.out.println(student2.idade);
        System.out.println(student2.sexo);
    }
}


