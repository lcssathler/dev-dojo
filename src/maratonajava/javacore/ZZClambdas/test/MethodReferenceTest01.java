package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.domain.Anime;
import maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes =  new ArrayList<>(List.of(
                new Anime("DBZ", 350),
                new Anime("Naruto", 490),
                new Anime("Akira", 12),
                new Anime("HxH", 180)));
        Collections.sort(animes, AnimeComparators::sortByTitle);
        System.out.println();
        Collections.sort(animes, AnimeComparators::sortByEpisodes);

        System.out.println(animes);
    }
}
