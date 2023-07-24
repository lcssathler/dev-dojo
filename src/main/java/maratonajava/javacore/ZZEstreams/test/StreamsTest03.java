package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Dragon Ball z", 2.55),
            new LightNovel("Full Metal Brotherhood", 9.45),
            new LightNovel("Naruto", 3.00),
            new LightNovel("Sword Art Online", 3.00),
            new LightNovel("Akame Ga Kill", 3.67),
            new LightNovel("Akame Ga Kill", 3.67),
            new LightNovel("Hellsing", 6.89),
            new LightNovel("Jujutsu no Kaisen", 6.89)
    ));

    public static void main(String[] args) {
        list.stream().forEach(System.out::println);
        System.out.println();

        Stream<LightNovel> stream = list.stream();

        long count = stream.
                filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count);


        long distinct = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(distinct);
    }
}
