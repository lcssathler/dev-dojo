package maratonajava.javacore.Aintroducaoclasses.teste;

import maratonajava.javacore.Aintroducaoclasses.dominio.Turma;

public class TurmaTeste01 {
    public static void main(String[] args) {
        Turma aluno1 = new Turma();

        aluno1.nome = "Lucas";
        aluno1.idade = 21;
        aluno1.sexo = 'M';
        System.out.println(aluno1.nome);
    }

}
