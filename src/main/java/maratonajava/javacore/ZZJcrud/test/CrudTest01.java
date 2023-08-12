package maratonajava.javacore.ZZJcrud.test;

import maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.List;
import java.util.Scanner;

public class CrudTest01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        List<Integer> choices = List.of(1, 2);
        while (!choices.contains(option)) {
            System.out.println("-".repeat(20) + "MENU" + "-".repeat(20));
            System.out.println("""
                               1. Find
                               2. Exit""");
            System.out.print("Choose a option: ");
            option = Integer.parseInt(scanner.nextLine());
            if (option == 2) break;
            ProducerService.menu(option);

        }
    }
}
