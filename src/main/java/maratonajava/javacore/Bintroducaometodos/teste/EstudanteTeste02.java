package maratonajava.javacore.Bintroducaometodos.teste;

import maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante imprime = new Estudante();

        estudante01.nome = "Lucas";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Kamylle";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
