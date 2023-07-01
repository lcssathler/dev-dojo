package maratonajava.javacore.ZZFthreads.test;

import maratonajava.javacore.ZZFthreads.domain.Account;

public class ThreadsAccountTest01 implements Runnable{
    private Account account = new Account();


    public static void main(String[] args) {
        ThreadsAccountTest01 accountTest01 = new ThreadsAccountTest01();
        Thread thread1 = new Thread(accountTest01, "Thread-1");
        Thread thread2 = new Thread(accountTest01, "Thread-2");
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("ERROR! NEGATIVE BALANCE!");
            }
        }
    }

    private void withdrawal(int amount) {
        System.out.println("\u001B[33m OUTSIDE " + getName() + "\u001B[m");
        synchronized (account) {
            System.out.println("\u001B[31m INSIDE " + getName() + " SYNCHORONIZED ACCOUNT \u001B[m");
            if (account.getBalance() >= amount) {
                System.out.println(getName() + " is going to withdrawal money");
                account.withdrawal(amount);
                System.out.println(getName() + " finished withdrawing money. New balance: " + account.getBalance());
            } else {
                System.out.println(getName() + ", insufficient balance to withdraw!");
            }
            System.out.println();
        }
    }

    private static String getName() {
        return Thread.currentThread().getName();
    }
}
