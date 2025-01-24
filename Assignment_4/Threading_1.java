import java.util.*;
import java.io.*;
import java.math.*;
import java.net.*;

@SuppressWarnings("unused")

public class Threading_1 {

    public static Integer num1 = 0;
    public static Integer num2 = 0;
    public static Object lock = new Object();
    
    public static void main(String args[]) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Thread[] threads1 = new Thread[1000];
        Thread[] threads2 = new Thread[1000];

        for (int i = 0; i < 1000; i++) 
        {
            threads1[i] = new Thread(() -> num1++);
            threads1[i].start();
        }

        for (Thread thread : threads1) 
        {
            thread.join();  
        }

        System.out.println("Without synchronization: " + num1);

        for (int i = 0; i < 1000; i++) 
        {
            threads2[i] = new Thread(() -> 
            {
                synchronized (lock) {
                    num2++;
                }
            });
            threads2[i].start();
        }

        for (Thread thread : threads2) 
        {
            thread.join();  
        }

        System.out.println("With synchronization: " + num2);

        scanner.close();
    }
}
