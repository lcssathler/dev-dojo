package maratonajava.introducao;

public class Aula09ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] years = new int[3][3];
        years[0][0] = 30;
        years[0][1] = 31;
        years[0][2] = 32;

        years[1][0] = 40;
        years[1][1] = 41;
        years[1][2] = 42;

        years[2][0] = 50;
        years[2][1] = 51;
        years[2][2] = 52;

        for (int i = 0; i < years.length; i++) {
            for (int j = 0; j < years[i].length; j++) {
                System.out.println(years[i][j]);
            }
        }
        System.out.println("-----------------------");
        for ( int[] i: years) {
            for (int j: i) {
                System.out.println(j);
            }
        }
    }
}
