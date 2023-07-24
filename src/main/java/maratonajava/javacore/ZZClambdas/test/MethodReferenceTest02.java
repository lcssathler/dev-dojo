package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.domain.Anime;
import maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animes =  new ArrayList<>(List.of(
                new Anime("DBZ", 350),
                new Anime("Naruto", 490),
                new Anime("Akira", 12),
                new Anime("HxH", 180)));
        Collections.sort(animes, animeComparators::nonStaticSortByEpisodes);
        System.out.println(animes);
    }
}
