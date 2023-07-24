package maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamsTest10 {
    public static void main(String[] args) {
        Stream.iterate(0, x -> x + 2)
                .limit(10)
                .forEach((n) -> System.out.print(n + " "));
        System.out.println("\n");

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[0])
                .forEach(System.out::println);
        System.out.println("\n");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 100))
                .limit(10)
                .forEach(System.out::println);
    }
}
