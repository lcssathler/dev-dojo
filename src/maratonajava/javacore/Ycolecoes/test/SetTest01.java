package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(4L, "Jujutsu Kaisen", 2.99, 5));
        mangas.add(new Manga(2L, "Dragon Ball Z", 13.24, 0));
        mangas.add(new Manga(5L, "Hunter X Hunter", 10, 0));
        mangas.add(new Manga(1L, "Akame Ga Kill!", 15.90, 2));
        mangas.add(new Manga(3L, "One Piece", 4.50, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
