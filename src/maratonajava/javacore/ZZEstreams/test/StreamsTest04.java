package maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<List<String>> employees = new ArrayList<>();
        List<String> devs = List.of("Lucas", "Camila", "José");
        List<String> producers = List.of("Jão", "Mateus", "Lara");
        List<String> designers = List.of("Michele", "Josue", "Cunha");
        employees.add(devs);
        employees.add(producers);
        employees.add(designers);

        for (List<String> employee : employees) {
            for (String person : employee) {
                System.out.println(person);
            }
        }
        System.out.println();

        employees.stream().
                map(Collection::stream).
                forEach(System.out::println);

        System.out.println();

        employees.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
