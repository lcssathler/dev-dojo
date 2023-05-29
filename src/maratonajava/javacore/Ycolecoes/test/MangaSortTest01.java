package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Jujutsu Kaisen", 2.99));
        mangas.add(new Manga(2L, "Dragon Ball Z", 13.24));
        mangas.add(new Manga(5L, "Hunter X Hunter", 10));
        mangas.add(new Manga(1L, "Akame Ga Kill!", 15.90));
        mangas.add(new Manga(3L, "One Piece", 4.50));

        Collections.sort(mangas);
        System.out.println("By name using Comparable interface");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-=".repeat(30));

        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("By ID using Comparator interface");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
