package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;
import maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTest15 {
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
        Map<Category, DoubleSummaryStatistics> statics = list.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                                               Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(statics);
        System.out.println();

        //Map<Category, List<Promotion>>
        Map<Category, List<Promotion>> collect = list.stream()
            .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(
                    ln -> ln.getPrice() >= 6
                            ? Promotion.NORMAL_PRICE
                            : Promotion.UNDER_PROMOTION, Collectors.toList())));
    }
}
