package maratonajava.javacore.ZZFthreads.test;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        Runnable r1 = () -> {
            synchronized (object1) {
                System.out.println("Thread 1: holding lock 1");
                System.out.println("Thread 1: waiting for lock 2");
                synchronized (object2) {
                    System.out.println("Thread 1: holding lock 2");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (object2) {
                System.out.println("Thread 2: holding lock 2");
                System.out.println("Thread 2: waiting for lock 1");
                synchronized (object1) {
                    System.out.println("Thread 1: holding lock 1");
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
