package maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamsTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 5, 12, 10);
        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        Integer sum1 = integers.stream()
                .reduce(5, Integer::sum);
        System.out.println(sum1);

        Integer sum2 = integers.stream()
                .reduce(3, (x, y) -> x * y);
        System.out.println(sum2);

        Integer sum3 = integers.stream()
                .reduce(0, (x, y) -> x * y);
        System.out.println(sum3);

        integers.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);
    }
}
