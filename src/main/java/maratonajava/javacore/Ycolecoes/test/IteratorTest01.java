package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Jujutsu Kaisen", 2.99, 5));
        mangas.add(new Manga(2L, "Dragon Ball Z", 13.24, 0));
        mangas.add(new Manga(5L, "Hunter X Hunter", 10, 0));
        mangas.add(new Manga(1L, "Akame Ga Kill!", 15.90, 2));
        mangas.add(new Manga(3L, "One Piece", 4.50, 0));

        Iterator<Manga> iterator = mangas.iterator();
        while (iterator.hasNext()) {
            Manga manga = iterator.next();
            if (manga.getQuantify() == 0) {
                iterator.remove();
            }
        }
        System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantify() == 2);
        System.out.println(mangas);
    }
}
