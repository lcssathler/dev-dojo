package maratonajava.javacore.ZZFthreads.test;


class ThreadExample extends Thread {
    private char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 50; i++) {
            System.out.print(c);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}


class ThreadExampleRunnable implements Runnable {
    private char c;

    public ThreadExampleRunnable (char c) {
        this.c = c;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 50; i++) {
            System.out.print(c);
            if (i % 10 == 0) {
                System.out.println();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadExample t1 = new ThreadExample('A');
        ThreadExample t2 = new ThreadExample('B');
        ThreadExample t3 = new ThreadExample('C');
        ThreadExample t4 = new ThreadExample('D');

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        System.out.println(Thread.currentThread().getName());
        Thread r1 = new Thread(new ThreadExampleRunnable2('O'), "T1");
        Thread r2 = new Thread(new ThreadExampleRunnable2('p'), "T2");
        Thread r3 = new Thread(new ThreadExampleRunnable2('Q'), "T3");
        Thread r4 = new Thread(new ThreadExampleRunnable2('R'), "T4");

        r1.start();
        r2.start();
        r3.start();
        r4.start();
    }
}
