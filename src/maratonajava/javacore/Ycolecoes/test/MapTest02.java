package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Consumer;
import maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Lucas Sathler");
        Consumer consumer2 = new Consumer("William Suane");

        Manga manga1 =  new Manga(4L, "Jujutsu Kaisen", 2.99);
        Manga manga2 =  new Manga(2L, "Dragon Ball Z", 13.24);
        Manga manga3 =  new Manga(5L, "Hunter X Hunter", 10);
        Manga manga4 =  new Manga(3L, "Akame Ga Kill!", 15.90);
        Manga manga5 =  new Manga(1L, "One Piece", 4.50);

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, manga1);
        consumerMangaMap.put(consumer2, manga2);
        System.out.println(consumerMangaMap);

         for (Map.Entry<Consumer, Manga> entry: consumerMangaMap.entrySet()) {
             System.out.println(entry.getKey().getName() + " : " + entry.getValue().getName());
         }
    }
}
