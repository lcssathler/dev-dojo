package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Consumer;
import maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Lucas Sathler");
        Consumer consumer2 = new Consumer("William Suane");

        Manga manga1 =  new Manga(4L, "Jujutsu Kaisen", 2.99);
        Manga manga2 =  new Manga(2L, "Dragon Ball Z", 13.24);
        Manga manga3 =  new Manga(5L, "Hunter X Hunter", 10);
        Manga manga4 =  new Manga(3L, "Akame Ga Kill!", 15.90);
        Manga manga5 =  new Manga(1L, "One Piece", 4.50);

        List<Manga> mangaListConsumer1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaListConsumer2 = List.of(manga3, manga4, manga5);
        Map<Consumer, List<Manga>> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, mangaListConsumer1);
        consumerMangaMap.put(consumer2, mangaListConsumer2);

        for (Map.Entry<Consumer, List<Manga>> entry : consumerMangaMap.entrySet()) {
            String consumerName = entry.getKey().getName();
            List<Manga> mangaList = entry.getValue();
            System.out.print(consumerName + " : ");
            for (Manga manga : entry.getValue()) {
                if (manga.equals(mangaList.get(mangaList.size() - 1))) {
                    System.out.println(manga.getName());
                } else {
                    System.out.print(manga.getName() + ", ");
                }
            }
        }
    }
}
