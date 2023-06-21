package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        boolean match = list.stream()
            .anyMatch(ln -> ln.getPrice() > 10);
        System.out.println(match);

        boolean allMatch = list.stream()
            .allMatch(ln -> ln.getPrice() > 5);
        System.out.println(allMatch);

        boolean noneMatch = list.stream()
            .noneMatch(ln -> ln.getPrice() > 12);
        System.out.println(noneMatch);

        list.stream()
                .filter(ln -> ln.getPrice() > 5)
                .findAny()
                .ifPresent(System.out::println);

        list.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
