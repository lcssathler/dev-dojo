package maratonajava.introducao;
/*
* Prática
* Crie variáveis para os campos descritos abaixo em <> e imprima a seguinte mensagem:
*
* Eu, <nome>, morando no endereço <endereço>,
* confirmo que recebi o salário <salario>, na data <data>
*/
public class Aula03TiposPrimitivosEx {
    public static void main (String[] args) {
        String name = "Lucas Sathler";
        String address = "Rua Edimburgo 172";
        double wage = 2465.89;
        String receiveDateWage = "19/03/2023";
        float teste = 14.45f;
        String report = "Eu, " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de R$" + wage + ", na data " + receiveDateWage+ ".";

        System.out.println(report);
    }
}
