package maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int yourAge = 22;
        String classification;
        if (yourAge >= 0 && yourAge <16) {
        classification = "Kid";
        } else if (yourAge >= 16 && yourAge < 18) {
            classification = "Adolescent";
        } else {
            classification = "Adult";
        }
        System.out.println("You're a " + classification);
    }
}
