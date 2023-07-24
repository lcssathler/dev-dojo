package maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest09 {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("I", "am", "loving", "studying", "Java")
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        int[] nums = {1, 2, 3, 4, 5};
        Arrays.stream(nums)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        try (Stream<String> lines = Files.lines(Paths.get("text.txt"))) {
            lines.filter(l -> l.contains("Java")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
