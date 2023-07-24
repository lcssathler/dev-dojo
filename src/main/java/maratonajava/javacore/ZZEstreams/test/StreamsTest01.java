package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.*;

public class StreamsTest01 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Dragon Ball z", 2.55),
            new LightNovel("Full Metal Brotherhood", 9.45),
            new LightNovel("Naruto", 3.00),
            new LightNovel("Akame Ga Kill", 3.67),
            new LightNovel("Hellsing", 6.89)
    ));

    public static void main(String[] args) {
        Collections.sort(list, Comparator.comparing(LightNovel::getTitle));
        System.out.println(list);

        Queue<LightNovel> lightNovelQueue = new PriorityQueue<>(Comparator.comparingDouble(LightNovel::getPrice));
        for (LightNovel lightNovel : list) {
            if (lightNovel.getPrice() <= 4) {
                lightNovelQueue.add(lightNovel);
            }
            if (lightNovelQueue.size() == 3) break;
        }

        System.out.println(lightNovelQueue);

    }
}
