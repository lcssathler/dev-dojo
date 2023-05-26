package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Lucas");
        names.add("Sathler");
        names.add("de");
        names.add("Aguiar");
        names.add("Policarpo");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}
