package maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("lucas");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<Object> optional3 = Optional.empty();
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println();

        Optional<String> optionalName = Optional.ofNullable(findName("Lucas"));
        String empty = optionalName.orElse("VALUE NOT FOUND!");
        System.out.println(empty);
        System.out.println();

        optionalName.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    public static String findName(String name) {
        List<String> listName = List.of("Lucas", "Sathler", "Aguiar");
        int i = listName.indexOf(name);
        if (i != -1) {
            return listName.get(i);
        }
        return null;
    }
}
