package maratonajava.javacore.Bintroducaometodos.teste;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import maratonajava.javacore.Bintroducaometodos.dominio.ImprimirSalarioFuncionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
    Funcionario pessoa1 = new Funcionario();
    Funcionario pessoa2 = new Funcionario();
    Funcionario pessoa3 = new Funcionario();
    ImprimirSalarioFuncionario salario = new ImprimirSalarioFuncionario();

//    pessoa1.nome = "Lucas";
//    pessoa1.idade = 21;
//    pessoa1.salario = 1245;
//
//    pessoa2.nome = "Adriano";
//    pessoa2.idade = 34;
//    pessoa2.salario = 4450;
//
//    pessoa3.nome = "Félix";
//    pessoa3.idade = 33;
//    pessoa3.salario = 4000;

//    double salarioPessoa1 = pessoa1.imprimirDados();
//    double salarioPessoa2 = pessoa2.imprimirDados();
//    double salarioPessoa3 = pessoa3.imprimirDados();

//    salario.mediaSalarial(salarioPessoa1, salarioPessoa2, salarioPessoa3);
        pessoa1.setNome("Lucas");
        pessoa1.setIdade(21);
        pessoa1.setSalario(2000);

        pessoa2.setNome("Kamylle");
        pessoa2.setIdade(19);
        pessoa2.setSalario(1000);

        pessoa3.setNome("Reinaldo");
        pessoa3.setIdade(32);
        pessoa3.setSalario(3000);

        System.out.println(pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Salário: " + pessoa1.getSalario());
        System.out.println("------------------------------------");

        System.out.println(pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Salário: " + pessoa2.getSalario());
        System.out.println("------------------------------------");

        System.out.println(pessoa3.getNome());
        System.out.println("Idade: " + pessoa3.getIdade());
        System.out.println("Salário: " + pessoa3.getSalario());
        System.out.println("------------------------------------");

        salario.mediaSalarial(pessoa1.getSalario(), pessoa2.getSalario(), pessoa3.getSalario());
    }


}
