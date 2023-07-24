package maratonajava.javacore.ZZGconcorrencia.test;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Count {
    private AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock(true);
    private int count;

    void increment() {
        lock.lock();
        try {
            this.count++;
            atomicInteger.incrementAndGet();
        } finally {
            lock.unlock();
        }

    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        };

        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(count.getCount());
        System.out.println(count.getAtomicInteger());
    }
}
