package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest02 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Dragon Ball z", 2.55),
            new LightNovel("Full Metal Brotherhood", 9.45),
            new LightNovel("Naruto", 3.00),
            new LightNovel("Akame Ga Kill", 3.67),
            new LightNovel("Hellsing", 6.89)
    ));

    public static void main(String[] args) {
        List<String> collect = list.stream()
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .filter(price -> price.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
