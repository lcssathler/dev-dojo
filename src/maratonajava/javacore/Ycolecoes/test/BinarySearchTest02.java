package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Jujutsu Kaisen", 2.99));
        mangas.add(new Manga(2L, "Dragon Ball Z", 13.24));
        mangas.add(new Manga(5L, "Hunter X Hunter", 10));
        mangas.add(new Manga(3L, "Akame Ga Kill!", 15.90));
        mangas.add(new Manga(1L, "One Piece", 4.50));

//        Collections.sort(mangas);
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


        Manga mangaToSearch = new Manga(3L, "Akame Ga Kill!", 15.90);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
