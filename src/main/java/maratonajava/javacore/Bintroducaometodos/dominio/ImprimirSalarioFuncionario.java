package maratonajava.javacore.Bintroducaometodos.dominio;

public class ImprimirSalarioFuncionario {


    public void mediaSalarial(double...todosSalarios) {
        double somaSalarial = 0;
        for (double salario: todosSalarios) {
            if (salario == 0) {
                System.out.println("--------");
                System.out.println("Não é possível calcular a média salarial pois um dos funcionários não teve o salário definido.");
                return;
            }
            somaSalarial += salario;
        }
        System.out.println("--------");
        System.out.println("A média salarial dos " + todosSalarios.length + " funcionários é igual a R$" + somaSalarial / todosSalarios.length);
    }
}
