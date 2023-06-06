package maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("123");
        list.add(123);
        list.add(123L);

        for (Object element : list) {
            System.out.println(element.getClass() + ": " + element);
        }
        System.out.println();

        List<String> stringList = new ArrayList();
        stringList.add("Lucas");
        stringList.add("Sathler");
        stringList.add("Aguiar");

        for (String string : stringList) {
            System.out.println(string);
        }
    }
}
