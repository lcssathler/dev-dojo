package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator());
        mangas.add(new Manga(4L, "Jujutsu Kaisen", 2.99));
        mangas.add(new Manga(2L, "Dragon Ball Z", 13.24));
        mangas.add(new Manga(5L, "Hunter X Hunter", 10));
        mangas.add(new Manga(3L, "Akame Ga Kill!", 15.90));
        mangas.add(new Manga(1L, "One Piece", 4.50));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }

        System.out.println(mangas);
    }
}
