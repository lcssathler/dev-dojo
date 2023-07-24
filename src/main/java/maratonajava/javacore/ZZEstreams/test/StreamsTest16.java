package maratonajava.javacore.ZZEstreams.test;

import java.util.concurrent.atomic.LongAdder;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000L;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLonglStreamIterate(num);
        sumParallelLonglStreamIterate(num);
    }

    public static void sumFor(long num) {
        System.out.print("Sum using for: " );
        long result = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " ->  " + (end - start) + "ms");
    }

    public static void sumStreamIterate(long num) {
        System.out.print("Sum using Stream Iterate: " );
        long result = 0;
        long start = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce + " ->  " + (end - start) + "ms");
    }

    public static void sumParallelStreamIterate(long num) {
        System.out.print("Sum using Parallel Stream Iterate: " );
        long result = 0;
        long start = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1)
                .limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce + " ->  " + (end - start) + "ms");
    }

    public static void sumLonglStreamIterate(long num) {
        System.out.print("Sum using LongStream Iterate: " );
        long result = 0;
        long start = System.currentTimeMillis();
        long reduce = LongStream.rangeClosed(1, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce + " ->  " + (end - start) + "ms");
    }

    public static void sumParallelLonglStreamIterate(long num) {
        System.out.print("Sum using Parallel LongStream Iterate: " );
        long result = 0;
        long start = System.currentTimeMillis();
        long reduce = LongStream.rangeClosed(1, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce + " ->  " + (end - start) + "ms");
    }
}
