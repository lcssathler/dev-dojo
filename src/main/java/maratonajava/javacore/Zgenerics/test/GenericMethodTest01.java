package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.domain.Boat;
import maratonajava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest01 {
    public static <T> List<T> printObject(T t) {
        List<T> list = List.of(t);
        return list;
    }

    public static void main(String[] args) {
        List<Boat> listBoat = printObject(new Boat("Yacht"));
        System.out.println(listBoat);
    }
}
