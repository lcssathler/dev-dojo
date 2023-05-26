package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String name1 = "Lucas";
        String name2 = new String("Lucas");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println();

        Smartphone s1 = new Smartphone("2NSB4", "Apple");
        Smartphone s2 = new Smartphone("2NSB4", "Samsung");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
