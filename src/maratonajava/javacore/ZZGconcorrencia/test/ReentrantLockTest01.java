package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest01 implements Runnable {
    private String name;
    private ReentrantLock lock;

    public ReentrantLockTest01(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            if (lock.isHeldByCurrentThread()) {
                System.out.printf("Thread %s is holding lock%n", name);
            };

            System.out.printf("%d threads waiting in queue%n", lock.getQueueLength());
            System.out.printf("Thread %s will wait for 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s ended to waiting", name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new ReentrantLockTest01("A", lock)).start();
        new Thread(new ReentrantLockTest01("B", lock)).start();
        new Thread(new ReentrantLockTest01("C", lock)).start();
        new Thread(new ReentrantLockTest01("D", lock)).start();
        new Thread(new ReentrantLockTest01("E", lock)).start();
        new Thread(new ReentrantLockTest01("F", lock)).start();
        new Thread(new ReentrantLockTest01("G", lock)).start();
    }
}
