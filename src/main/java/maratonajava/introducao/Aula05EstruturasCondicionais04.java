package maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salary = 45000;
        float percent;
        if (salary >= 0 && salary <= 34712) {
            percent = 9.7f;
        } else if (salary >= 34713 && salary <= 68507) {
            percent = 37.35f;
        } else {
            percent = 49.5f;
        }
        double tax = salary * (percent / 100);
        System.out.println("Seu salário: " + salary);
        System.out.println("Imposto: " + tax);
        System.out.println("Salário Final: " + (salary - tax));
    }
}
