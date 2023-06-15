package maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "Lucas", "João", "Cleber", "Wilson", "Carlos"
        ));
        names.sort(String::compareTo);
        System.out.println(names);

        //Function<String, Integer> numStringToInteger = s -> Integer.parseInt(s);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("20");
        System.out.println(num.getClass() + " " + num);

        //BiPredicate<List<String>, String> checkName = (list, name) -> list.contains(name);
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Lucas"));
        System.out.println(checkName.test(names, "Valter"));
    }
}
