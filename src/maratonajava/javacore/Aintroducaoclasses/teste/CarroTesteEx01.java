package maratonajava.javacore.Aintroducaoclasses.teste;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTesteEx01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        carro1 = carro2;

        carro1.nome = "HB20";
        carro1.modelo = "Hatch";
        carro1.ano = 2018;

        carro2.nome = "Civic";
        carro2.modelo = "Sedan";
        carro2.ano = 2022;

        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
        System.out.println("");
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}
