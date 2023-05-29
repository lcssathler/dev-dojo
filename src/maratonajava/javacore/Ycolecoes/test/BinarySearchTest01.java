package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(2);

        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers, 1));
    }
}
