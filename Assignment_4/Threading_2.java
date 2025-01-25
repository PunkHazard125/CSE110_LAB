import java.util.*;
import java.util.concurrent.*;
import java.io.*;
import java.math.*;
import java.net.*;

@SuppressWarnings("unused")

public class Threading_2 {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        BkashAccount account = new BkashAccount();

        ExecutorService executors = Executors.newCachedThreadPool();

        executors.submit(new Thread(() -> account.deposit(5000)));
        executors.submit(new Thread(() -> account.deposit(2000)));
        executors.submit(new Thread(() -> account.deposit(1000)));

        executors.shutdown();

        while (!executors.isTerminated()) { }

        System.out.println("Balance: " + account.getBalance());

        scanner.close();
    }
}

class BkashAccount {

    private int balance = 0;
    
    public synchronized void deposit(int amount) {

        balance += amount;
        
    }

    public synchronized int getBalance() {

        return balance;

    }
}
