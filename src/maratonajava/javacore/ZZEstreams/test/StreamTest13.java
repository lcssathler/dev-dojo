package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;
import maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest13 {
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
        //Map<Promotion, <List<LightNovels>>
        Map<Promotion, List<LightNovel>> promotionGroup = list.stream()
            .collect(Collectors.groupingBy(
                    ln -> ln.getPrice() >= 6
                            ? Promotion.NORMAL_PRICE
                            : Promotion.UNDER_PROMOTION));
        System.out.println(promotionGroup);
        System.out.println();

        //Map<Category, Map<Promotion, List<LighNovels>>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect = list.stream()
            .collect(Collectors.groupingBy(LightNovel::getCategory,
                                             Collectors.groupingBy(
                                                   ln -> ln.getPrice() >= 6
                                                           ? Promotion.NORMAL_PRICE
                                                           : Promotion.UNDER_PROMOTION
                                           )));

        }
    }

}
