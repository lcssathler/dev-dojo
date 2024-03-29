package maratonajava.javacore.ZZDoptional.test;

import maratonajava.javacore.ZZDoptional.domain.Manga;
import maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;


public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Attack On Titan");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Attack On Titan 2 - Remastered"));
        System.out.println(mangaByTitle);

        Optional<Manga> mangaById = MangaRepository.findById(2);
        mangaById.orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Optional<Manga> createManga = MangaRepository.findByTitle("Dr. Stone");
        Manga newManga = createManga.orElse(new Manga(3, "Dr. Stone", 14));
        System.out.println(newManga);
    }


}
