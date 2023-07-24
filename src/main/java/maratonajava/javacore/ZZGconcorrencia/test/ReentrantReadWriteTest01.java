package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    private ReentrantReadWriteLock rwl;

    public MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value) {
        rwl.writeLock().lock();
        try {
            if (rwl.isWriteLocked()) {
                System.out.printf("%s got  WRITE LOCK%n", Thread.currentThread().getName());
            }
            map.put(key, value);
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        } finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> read() {
        rwl.readLock().lock();
        try {
            return map.keySet();
        } finally {
            rwl.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(rwl);

        Runnable write = () -> {
            for (int i = 0; i < 10; i++) {
                mapReadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable read = () -> {
            if (rwl.isWriteLocked()) {
                System.out.println("WRITE LOCKED! YOU CAN NOT READ!!!");
            }

            rwl.readLock().lock();
            System.out.println("Read is lock!");
            try {
                System.out.println(Thread.currentThread().getName() + mapReadWrite.read());
            } finally {
                rwl.readLock().unlock();
            }
        };

        Thread thread1 = new Thread(write);
        Thread thread2 = new Thread(read);
        Thread thread3 = new Thread(read);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
