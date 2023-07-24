package maratonajava.javacore.ZZFthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return this.emails.size();
        }
    }

    public void addMember(String email) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " just addded emails from list");
        synchronized (this.emails) {
            emails.add(email);
            emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (this.emails) {
            while (this.emails.size() == 0) {
                if (!open) break;
                System.out.println("There are no available emails in the list. STANDBY MOD ACTIVATED!");
                this.emails.wait();
            }

            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println("Inbox closed.");
        }
    }
}
