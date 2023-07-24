package maratonajava.javacore.Aintroducaoclasses.teste;
import maratonajava.javacore.Aintroducaoclasses.dominio.Turma;

public class TurmaTeste02 {
    public static void main(String[] args) {
        Turma estudante1 = new Turma();
        estudante1.nome = "Vegeta";
        Turma estudante2 = new Turma();

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
        System.out.println("-----------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
