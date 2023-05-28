package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingListTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList();
        mangas.add("SNK");
        mangas.add("DBZ");
        mangas.add("CDZ");
        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println();

        List<Integer> integers = new ArrayList();
        integers.add(1542);
        integers.add(123);
        integers.add(234);
        Collections.sort(integers);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
