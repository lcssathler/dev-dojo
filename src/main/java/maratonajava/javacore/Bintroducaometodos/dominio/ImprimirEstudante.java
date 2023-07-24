package maratonajava.javacore.Bintroducaometodos.dominio;

public class ImprimirEstudante {
    public void imprime(Estudante aluno) {
        aluno.nome = "José";
        System.out.println("Dentro do método imprime(Estudante aluno){}: ");
        System.out.println(aluno.nome);
        System.out.println(aluno.idade);
        System.out.println(aluno.sexo);
    }
}
