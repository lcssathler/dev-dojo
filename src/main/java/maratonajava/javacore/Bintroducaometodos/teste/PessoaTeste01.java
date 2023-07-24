package maratonajava.javacore.Bintroducaometodos.teste;

import maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Lucas");
        pessoa1.setIdade(21);
        //pessoa1.imprime();

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

    }
}
