package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest11 {
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
        System.out.println(list.stream().count());
        System.out.println(list.stream().collect(Collectors.counting()));
        System.out.println();

        list.stream()
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
        list.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);
        System.out.println();

        System.out.println(list.stream()
                                   .mapToDouble(LightNovel::getPrice)
                                   .sum());
        System.out.println(list.stream()
                                   .collect(Collectors.summingDouble(LightNovel::getPrice)));
        System.out.println();

        list.stream()
                .mapToDouble(LightNovel::getPrice)
                .average()
                .ifPresent(System.out::println);
        System.out.println(list.stream()
                                   .collect(Collectors.averagingDouble(LightNovel::getPrice)));
        System.out.println();

        DoubleSummaryStatistics statistics = list.stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(statistics);
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getCount());

        String collect = list.stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
