package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Manga;
import maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneManufacturerCompare implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getManufacturer().compareTo(o2.getManufacturer());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneManufacturerCompare());
        Smartphone s1 = new Smartphone("2NSB4", "Apple");
        Smartphone s2 = new Smartphone("2NSB4", "Samsung");
        smartphones.add(s1);
        smartphones.add(s2);
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        System.out.println("-".repeat(30));

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(4L, "Jujutsu Kaisen", 2.99));
        mangas.add(new Manga(2L, "Dragon Ball Z", 13.24));
        mangas.add(new Manga(5L, "Hunter X Hunter", 10));
        mangas.add(new Manga(1L, "Akame Ga Kill!", 15.90));
        mangas.add(new Manga(3L, "One Piece", 4.50));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
