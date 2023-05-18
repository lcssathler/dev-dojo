package maratonajava.javacore.Qstrings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name1 = "Lucas";
        String name2 = "Lucas";
        name1 = name1.concat(" Sathler");
        String name3 = new String("Lucas");

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());


    }
}
