package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionsTest01 {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        condition.await(); // lock.wait()
        condition.signal(); // lock.notify()
        condition.signalAll(); //lock.notifyAll()

        lock.lock();
        try {
            //your code here
            condition.wait(2000);
        } finally {
            lock.unlock();
        }
    }
}

