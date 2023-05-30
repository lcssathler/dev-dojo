package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvertTest01 {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(4);
        listNumbers.add(1);
        listNumbers.add(9);
        Integer[] listToArray = listNumbers.toArray(new Integer[0]);

        System.out.println("listNumbers:" + listNumbers);
        System.out.println("listToArray:" + Arrays.toString(listToArray));
        System.out.println("-".repeat(40));

        Integer[] arrayNumbers = new Integer[3];
        arrayNumbers[0] = 100;
        arrayNumbers[1] = 200;
        arrayNumbers[2] = 300;
        List<Integer> arrayToList = Arrays.asList(arrayNumbers);
        arrayNumbers[0] = 500;
        System.out.println("arrayNumbers: " + Arrays.toString(arrayNumbers));
        System.out.println("arrayToList: " + arrayToList);
        System.out.println("-".repeat(40));

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(arrayNumbers));
        integers.add(45);
        System.out.println("integers: " + integers);
    }
}
