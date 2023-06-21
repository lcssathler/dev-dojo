package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Dragon Ball z", 2.55),
            new LightNovel("No Game No Life", 11.43 ),
            new LightNovel("Full Metal Brotherhood", 9.45),
            new LightNovel("Naruto", 3.00),
            new LightNovel("Sword Art Online", 3.00),
            new LightNovel("Akame Ga Kill", 3.67),
            new LightNovel("Akame Ga Kill", 3.67),
            new LightNovel("Hellsing", 6.89),
            new LightNovel("Jujutsu no Kaisen", 6.89)
    ));

    public static void main(String[] args) {
        list.stream()
                .map(LightNovel::getPrice)
                .filter(ln -> ln > 5)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = list.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(ln -> ln > 5)
                .sum();
        System.out.println(sum);
    }
}
