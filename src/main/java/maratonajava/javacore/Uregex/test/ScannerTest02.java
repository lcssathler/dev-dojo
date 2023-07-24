package maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Lucas, Sathler, false, 21";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(", ");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);
            } else if (scanner.hasNextBoolean()) {
                boolean isBoolean = scanner.nextBoolean();
                System.out.println("Is Boolean: " + isBoolean);
            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
