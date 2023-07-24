package maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest05 {
    public static void main(String[] args) {
        List<String> phrase = List.of("I", "Won't", "Give", "Up");
        List<String> collect = phrase.stream()
            .map(w -> w.split(""))
            .flatMap(Arrays::stream)
            .collect(Collectors.toList());
        System.out.println(collect);
    }
}
