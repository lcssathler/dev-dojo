package maratonajava.javacore.ZZFthreads.test;
class ThreadExampleRunnable2 implements Runnable {
    private char c;

    public ThreadExampleRunnable2(char c) {
        this.c = c;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 50; i++) {
            System.out.print(c);
            if (i % 10 == 0) {
                System.out.println();
            }
            Thread.yield();
        }
        System.out.println();
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Running");
        };

    }
}
