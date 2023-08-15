package maratonajava.javacore.ZZJcrud.test;

import maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.List;
import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER  = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        List<Integer> choices = List.of(1, 2, 3, 4);
        while (!choices.contains(option)) {
            System.out.println("-".repeat(20) + "MENU" + "-".repeat(20));
            System.out.println("""
                               1. Find
                               2. Delete
                               3. Save
                               4. Exit""");
            System.out.print("Choose a option: ");
            option = Integer.parseInt(SCANNER.nextLine());
            if (option == 4) break;
            ProducerService.menu(option);
        }
    }
}
