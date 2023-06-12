package maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 4, 8, 10);
        fakeForEach(integers, new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }

    public static <T> void fakeForEach(List<T> list, Consumer<T> consumer) {
        for (T element : list) {
            consumer.accept(element);
        }
    }
}
