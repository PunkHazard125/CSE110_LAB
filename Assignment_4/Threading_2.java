import java.util.*;
import java.io.*;
import java.math.*;
import java.net.*;

@SuppressWarnings("unused")

public class Threading_2 {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        BkashAccount account = new BkashAccount();

        Thread[] agents = new Thread[3];

        agents[0] = new Thread(() -> account.deposit(5000));
        agents[1] = new Thread(() -> account.deposit(2000));
        agents[2] = new Thread(() -> account.deposit(1000));
        
        for (int i = 0; i < agents.length; i++) 
        {
            agents[i].start();    
        }

        try 
        {
            for (int i = 0; i < agents.length; i++) 
            {
                agents[i].join();    
            }
        } 
        catch (InterruptedException ex) 
        {
            ex.printStackTrace();
        }

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
