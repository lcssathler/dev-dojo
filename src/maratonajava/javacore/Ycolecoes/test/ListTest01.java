package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList();
        List<String> names2 = new ArrayList();
        names1.add("Lucas");
        names1.add("Sathler");
        names2.add("Aguiar");
        names2.add("Lucas");
        names1.addAll(names2);

        for (int i = 0; i < names1.size(); i++) {
            System.out.println(names1.get(i));
        }

        List<Integer> nums = new ArrayList();
        nums.add(1);
    }
}
