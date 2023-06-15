package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.domain.Anime;
import maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
//        Supplier<AnimeComparators> newAnimeComparators = () -> new AnimeComparators();
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        System.out.println(animeComparators);

//        BiFunction<String, Integer, Anime> animeBiFunction = (title, eps) -> new Anime(title, eps);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        Anime kimetsuNoYaiba = animeBiFunction.apply("Kimetsu no Yaiba", 68);
        System.out.println(kimetsuNoYaiba);
    }
}
