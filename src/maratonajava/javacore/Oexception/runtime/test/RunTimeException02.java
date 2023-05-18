package maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RunTimeException02 {
    public static void main(String[] args) {
        try {
            calculatingDivision(1, 0);
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("The next lines will be executed");
    }

    public static int calculatingDivision(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("O dividendo não pode ser igual a zero.");
        }
        System.out.println("The next lines won't be executed.");
        return a/b;
    }
}
