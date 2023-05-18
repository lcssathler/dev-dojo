package maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String [] names = new String[4];
        names[0] = "Lucas";
        names[1] = "José";
        names[2] = "Kamylle";
        names[3] = "Alfredo";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        int [] numbers = new int[]{43,12,125,99};
        for (int n: numbers) {
            System.out.println(n);
        }
    }
}
