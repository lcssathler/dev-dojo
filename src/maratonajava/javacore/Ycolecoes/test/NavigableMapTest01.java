package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Consumer;
import maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Manga manga1 =  new Manga(4L, "Jujutsu Kaisen", 2.99);
        Manga manga2 =  new Manga(2L, "Dragon Ball Z", 13.24);

        NavigableMap<String, String> navMap = new TreeMap<>();
        navMap.put("B" , "Letter B");
        navMap.put("A" , "Letter A");
        navMap.put("D" , "Letter D");
        navMap.put("C" , "Letter C");

        for (Map.Entry<String, String> entry : navMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-".repeat(40));

        System.out.println(navMap.lowerEntry("C"));
        System.out.println(navMap.floorEntry("C"));
        System.out.println(navMap.higherEntry("C"));
        System.out.println(navMap.ceilingEntry("C"));
        System.out.println("-".repeat(40));

        System.out.println(navMap.headMap("C"));
        System.out.println(navMap.headMap("C", true));
    }
}
