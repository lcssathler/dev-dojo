package maratonajava.javacore.ZZJcrud.service;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZJcrud.domain.Anime;
import maratonajava.javacore.ZZJcrud.domain.Producer;
import maratonajava.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.List;
import java.util.Scanner;

@Log4j2
public class AnimeService {
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
        System.out.print("Anime name to save: ");
        String name = SCANNER.nextLine();

        System.out.print("Number of episodes: ");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        System.out.print("ID of the Producer: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        if (checkValidName(name) && checkValidNumber(episodes) && checkValidNumber(id)) {
            Anime anime = Anime.builder()
                    .name(name)
                    .episodes(episodes)
                    .producer(Producer.builder().id(id).build())
                    .build();
            AnimeRepository.save(anime);
        }
    }

    public static void findByName() {
        System.out.print("What name do you want to find by? (empty to all): ");
        String name = SCANNER.nextLine();
        List<Anime> animes = AnimeRepository.findByName(name);
        if (animes.isEmpty()) throw new IllegalArgumentException("Invalid value!");
        for (Anime anime : animes) {
            System.out.printf("[%d] - %s - %d - %s%n", anime.getId(), anime.getName(), anime.getEpisodes(), anime.getProducer());
        }
    }

    public static Anime findById(Integer id) {
        log.info("Finding Anime by id '{}'", id);
        if (!checkValidNumber(id)) {
            throw new IllegalArgumentException("Invalid id to find by id!");
        }
        Anime animeFromDB = AnimeRepository.findById(id);
        log.info("Anime found from database: '{}'", animeFromDB);
        return animeFromDB;
    }

    public static void update() {
        System.out.print("Type the ID Anime to update: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        Anime animeFromDB = findById(id);

        System.out.print("New name [empty to keep]: ");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDB.getName() : name;

        System.out.print("New total of episodes: ");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDB.getId())
                .name(name).
                episodes(episodes)
                .build();

        AnimeRepository.update(animeToUpdate);
    }

    public static void deleteById() {
        while (true) {
            System.out.print("Anime ID to delete: ");
            int id = Integer.parseInt(SCANNER.nextLine());
            if (checkValidNumber(id)) {
                AnimeRepository.deleteById(id);
                return;
            }
        }
    }

    private static boolean checkValidNumber(Integer id) {
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
