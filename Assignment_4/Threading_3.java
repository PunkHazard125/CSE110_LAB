import java.util.*;
import java.util.concurrent.locks.*;

public class Threading_3 {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();

        try 
        {
            producer.join();
            consumer.join();    
        } 
        catch (InterruptedException ex) 
        {
            ex.printStackTrace();
        }

        System.out.println("\nProduction and Consumption Completed.");

    }
}

class Buffer {

    private char data;
    private boolean available = false;
    private final Lock lock = new ReentrantLock();
    private final Condition bufferFull = lock.newCondition();
    private final Condition bufferEmpty = lock.newCondition();

    public Buffer() {}

    public void put(char c) {

        lock.lock();

        try 
        {
            while (available) 
            {
                bufferEmpty.await();    
            }
    
            data = c;
            available = true;
            System.out.println("Produced: " + data);
            bufferFull.signal();
        } 
        catch (InterruptedException ex) 
        {
            ex.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }

    }

    public char get() {

        lock.lock();

        try 
        {
            while (!available) 
            {
                bufferFull.await();    
            }
    
            available = false;
            System.out.println("Consumed: " + data);
            bufferEmpty.signal();
            return data;
        } 
        catch (InterruptedException ex) 
        {
            ex.printStackTrace();
            return '\0';
        }
        finally
        {
            lock.unlock();
        }

    }

}

class Producer implements Runnable {

    private final Buffer buffer;
    private final Random random = new Random();

    public Producer(Buffer buffer) {

        this.buffer = buffer;

    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) 
        {
            char c = (char)('A' + random.nextInt(26));
            buffer.put(c);
            
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

}

class Consumer implements Runnable {

    private final Buffer buffer;

    public Consumer(Buffer buffer) {

        this.buffer = buffer;

    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) 
        {
            buffer.get();
            
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

}
