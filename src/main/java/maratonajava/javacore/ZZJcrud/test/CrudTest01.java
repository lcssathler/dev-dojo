package maratonajava.javacore.ZZJcrud.test;

import maratonajava.javacore.ZZJcrud.service.AnimeService;
import maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.List;
import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                               1. Anime menu
                               2. Producer menu
                               0. EXIT
                               """);
            System.out.print("Choose one operation: ");
            int option = Integer.parseInt(SCANNER.nextLine());
            if (option == 0) break;
            switch (option) {
                case 1 -> animeMenu();
                case 2 -> producerMenu();
            }
            return;
        }
    }

    public static void animeMenu() {
        int option = 0;
        List<Integer> choices = List.of(1, 2, 3, 4);
        while (true) {
            System.out.println("-".repeat(20) + "MENU" + "-".repeat(20));
            System.out.println("""
                               1. Save anime
                               2. Find anime
                               3. Update anime
                               4. Delete anime
                               5. Exit""");
            System.out.print("Choose a option: ");
            option = Integer.parseInt(SCANNER.nextLine());
            if (option == 5) break;
            AnimeService.menu(option);
        }
    }

    public static void producerMenu() {
        int option = 0;
        List<Integer> choices = List.of(1, 2, 3, 4);
        while (true) {
            System.out.println("-".repeat(20) + "MENU" + "-".repeat(20));
            System.out.println("""
                               1. Save producer
                               2. Find producer
                               3. Update producer
                               4. Delete producer
                               5. Exit""");
            System.out.print("Choose a option: ");
            option = Integer.parseInt(SCANNER.nextLine());
            if (option == 5) break;
            ProducerService.menu(option);
        }
    }
}


