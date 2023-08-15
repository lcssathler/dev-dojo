package maratonajava.javacore.ZZJcrud.service;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZJcrud.domain.Producer;
import maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

@Log4j2
public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int option) {
        switch (option) {
            case 1 -> save();
            case 2 -> findByName();
            case 3 -> update();
            case 4 -> deleteById();
        }
    }

    public static void save() {
        System.out.print("Producer name to save: ");
        String name = SCANNER.nextLine();
        if (checkValidName(name)) {
            Producer producer = Producer.builder().name(name).build();
            ProducerRepository.save(producer);
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

    public static Producer findById(Integer id) {
        log.info("Finding Producer by id '{}'", id);
        if (!checkValidId(id)) {
            throw new IllegalArgumentException("Invalid id to find by id!");
        }
        Producer producerFromDB = ProducerRepository.findById(id);
        log.info("Producer found from database: '{}'", producerFromDB);
        return producerFromDB;
    }

    public static void update() {
        System.out.print("Type the ID Producer to update: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        Producer producerFromDB = findById(id);
        System.out.print("Type the new name to this producer [empty to kee]: ");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDB.getName() : name;
        Producer producerToUpdate = Producer.builder().id(producerFromDB.getId()).name(name).build();
        ProducerRepository.update(producerToUpdate);
    }

    public static void deleteById() {
        while (true) {
            System.out.print("Producer ID to delete: ");
            int id = Integer.parseInt(SCANNER.nextLine());
            if (checkValidId(id)) {
                ProducerRepository.deleteById(id);
                return;
            }
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
