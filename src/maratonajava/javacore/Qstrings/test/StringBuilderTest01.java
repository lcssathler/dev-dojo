package maratonajava.javacore.Qstrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name1 = "Lucas Sathler";
        name1.concat(" Aguiar Policarpo");
        StringBuilder name2 = new StringBuilder("Joseph August");
        name2.append(" Willer");
        name2.substring(1, 4);

        System.out.println(name1);
        System.out.println(name2);
    }
}
