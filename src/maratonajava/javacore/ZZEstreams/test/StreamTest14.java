package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Dragon Ball z", 2.55, Category.SHOUNEN),
            new LightNovel("Full Metal Brotherhood", 9.45, Category.SHOUNEN),
            new LightNovel("Naruto", 3.00, Category.ACTION),
            new LightNovel("Sword Art Online", 3.00, Category.ROMANCE),
            new LightNovel("Akame Ga Kill", 3.67, Category.ROMANCE),
            new LightNovel("Akame Ga Kill", 3.67, Category.ROMANCE),
            new LightNovel("Hellsing", 6.89, Category.COMEDY),
            new LightNovel("Jujutsu no Kaisen", 6.89, Category.ACTION)
    ));

    public static void main(String[] args) {
        Map<Category, Optional<LightNovel>> collect = list.stream()
            .collect(Collectors.groupingBy(LightNovel::getCategory,
                                       Collectors.maxBy(
                                           Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect);
        System.out.println();

        list.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                                       Collectors.collectingAndThen(
                                           Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get
                )));
        System.out.println();
    }
}
