package maratonajava.javacore.ZZClambdas.service;

import maratonajava.javacore.ZZClambdas.domain.Anime;

public class AnimeComparators {
    public static int sortByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int sortByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int nonStaticSortByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
