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
        names1.clear();
        System.out.println(names1.toString());

        for (int i = 0; i < names1.size(); i++) {
            System.out.println(names1.get(i));
        }
        System.out.println("-=".repeat(10));

        List<Integer> nums = new ArrayList();
        nums.add(245);
        nums.add(1123);
        nums.add(111);
        nums.add(0, 20000);
        System.out.println(nums);

        System.out.println(nums.indexOf(999));

        System.out.println(nums.contains(123));
        System.out.println(nums.contains(111));

        System.out.println(nums.get(3));
        System.out.println(nums.get(20));
    }
}
