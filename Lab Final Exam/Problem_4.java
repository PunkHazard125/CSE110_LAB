import java.util.*;
import java.math.*;
import java.io.*;
import java.net.*;

public class Problem_4 {
    
    public static void main(String[] args) {
        
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem(30);

        Thread[] users = new Thread[10];

        for (int i = 0; i < users.length; i++)
        {
            users[i] = new UserThread(ticketBookingSystem, "User-" + (i + 1));
            users[i].start();
        }

        try
        {
            for (int i = 0; i < users.length; i++)
        {
            users[i].join();
        }    
        } 
        catch (InterruptedException ex) 
        {
            ex.printStackTrace();
        }

        System.out.println("\nFinal Status: ");
        System.out.println("Available Tickets: " + ticketBookingSystem.getAvailableTickets());
        
    }
    
}

class TicketBookingSystem {

    private int numberOfTickets;

    public TicketBookingSystem(int num) {

        this.numberOfTickets = num;

    }

    public synchronized int getAvailableTickets() {

        return this.numberOfTickets;

    }

    public synchronized boolean bookTicket(int numOfTickets) {

        if (getAvailableTickets() >= numOfTickets && numOfTickets >= 1 && numOfTickets <= 5)
        {
            this.numberOfTickets = this.numberOfTickets - numOfTickets;
            return true;
        }
        else
        {
            return false;
        }

    }

}

class UserThread extends Thread {

    private TicketBookingSystem system;
    private Random random;

    public UserThread(TicketBookingSystem system, String name) {

        super(name);
        this.system = system;
        this.random = new Random();

    }

    @Override
    public void run() {

        int num = random.nextInt(5) + 1;

        System.out.println(Thread.currentThread().getName() + " is trying to buy " + num + " ticket(s).....");

        if (system.bookTicket(num))
        {
            System.out.println(Thread.currentThread().getName() + " has successfully bought " + num + " ticket(s)!");
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + " has failed to buy any ticket(s)!");
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
