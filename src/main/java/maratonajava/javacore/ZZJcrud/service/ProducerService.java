package maratonajava.javacore.ZZJcrud.service;

import maratonajava.javacore.ZZJcrud.domain.Producer;
import maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int option) {
        switch (option) {
            case 1:
                findByName();
                break;
            case 2:
                deleteById();
                break;
        }
    }

    public static void findByName() {
        System.out.print("What name do you want to find by? (empty to all): ");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        if (producers.isEmpty()) throw new IllegalArgumentException("Invalid value!");
        for (Producer producer : producers) {
            System.out.printf("[%d] - %s%n", producer.getId(), producer.getName());
        }
    }

    public static void deleteById() {
        System.out.println("Producer ID to delete: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        while (!checkValidId(id)) checkValidId(id);
        ProducerRepository.deleteById(id);
    }

    private static boolean checkValidId(Integer id) {
        boolean isValid = false;
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid ID!");
        }

        isValid = true;
        return isValid;
    }
}
