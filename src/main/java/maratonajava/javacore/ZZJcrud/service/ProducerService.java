package maratonajava.javacore.ZZJcrud.service;

import maratonajava.javacore.ZZJcrud.domain.Producer;
import maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int option) {
        switch (option) {
            case 1 -> findByName();
            case 2 -> deleteById();
            case 3 -> save();
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
        while (true) {
            System.out.print("Producer ID to delete: ");
            int id = Integer.parseInt(SCANNER.nextLine());
            if (checkValidId(id)){
                ProducerRepository.deleteById(id);
                return;
            }
        }
    }

    public static void save() {
        System.out.print("Producer name to save: ");
        String name = SCANNER.nextLine();
        if (checkValidName(name)) {
            Producer producer = Producer.builder().name(name).build();
            ProducerRepository.save(producer);
            return;
        }
    }

    private static boolean checkValidId(Integer id) {
        boolean isValid = false;
        if (id == null || id <= 0) {
            System.out.println(("Invalid ID!"));
        } else {
            isValid = true;
        }
        return isValid;
    }

    private static boolean checkValidName(String name) {
        boolean isValid = false;
        if (name == null || name.length() == 0) {
            System.out.println("Invalid name! Try again.");
        } else {
            isValid = true;
        }
        return isValid;
    }
}
