import java.util.*;
import java.util.concurrent.*;
import java.io.*;
import java.math.*;
import java.net.*;

@SuppressWarnings("unused")

public class Threading_4 {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(0.00);

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) 
        {
            executor.submit(new User(account)); 
        }

        executor.shutdown();

        while (!executor.isTerminated()) { }

        System.out.println("\nFinal balance: " + account.getBalance());

        scanner.close();
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double amount) {

        balance = amount;

    }

    public synchronized double getBalance() {

        return balance;

    }

    public synchronized void deposit(double amount) {

        if (amount > 0.00) 
        {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " has deposited $" + amount + ".");   
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + " has failed to deposit.");
        }

    }

    public synchronized void withdraw(double amount) {

        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawed $" + amount + ".");   
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + " has failed to withdraw $" + amount + ".");
        }

    }

}

class User implements Runnable {

    private final BankAccount account;
    private static final Random random = new Random();

    public User(BankAccount account) {

        this.account = account;

    }

    @Override
    public void run() {

        int action = random.nextInt(2);
        int amount = random.nextInt(1000) + 1;

        if (action == 0) 
        {
            account.deposit(amount);

        }
        else
        {
            account.withdraw(amount);
        }

        try 
        {
            Thread.sleep(500);
        } 
        catch (InterruptedException ex) 
        {
            ex.printStackTrace();
        }

    }

}
