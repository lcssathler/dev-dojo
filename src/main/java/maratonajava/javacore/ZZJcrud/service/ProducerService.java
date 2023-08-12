package maratonajava.javacore.ZZJcrud.service;

import maratonajava.javacore.ZZJcrud.domain.Producer;
import maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu(int option) {
        switch (option) {
            case 1: findByName();
        }
    }

    public static void findByName() {
        System.out.print("What name do you want to find by? (empty to all): ");
        String name = scanner.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        if (producers.isEmpty()) throw new IllegalArgumentException("Invalid value!");
        for (Producer producer : producers) {
            System.out.printf("[%d] - %s%n", producer.getId(), producer.getName());
        }
    }
}
