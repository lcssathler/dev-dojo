package maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Lucas, Sathler, de, Aguiar, Policarpo";
        String[] split = text.split(",");

        for (String s : split) {
            System.out.println(s.trim());
        }
    }
}
