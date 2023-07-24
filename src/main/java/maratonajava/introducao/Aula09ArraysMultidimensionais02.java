package maratonajava.introducao;

public class Aula09ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayEx = new int[2][];
        arrayEx[0] = new int[2];
        arrayEx[0][0] = 20;
        arrayEx[0][1] = 30;
        arrayEx[1] = new int[]{1,2,3};

        int[][] arrayEx2 = {{0,0}, {1,2,3}, {4,5,6,7}};
        for (int[] arrayBase: arrayEx2) {
            for (int elemento: arrayBase) {
                System.out.println(elemento);
            }
        }

    }
}
