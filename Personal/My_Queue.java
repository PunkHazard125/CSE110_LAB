import java.util.*;
import java.math.*;

@SuppressWarnings("unused")

public class My_Queue {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        

        scanner.close();
    }
}

class Queue {

    private int[] array;
    private int size;
    private int capacity;

    public Queue(int capacity) {

        this.array = new int[capacity];
        this.capacity = capacity;
        this.size = 0;

    }

    public void enqueue(int value) {

        if (size == capacity)
        {
            int[] temp = new int[capacity * 2];
            
            for (int i = 0; i < capacity; i++)
            {
                temp[i] = this.array[i];
            }

            array = temp;
            capacity = capacity * 2;
        }

        array[size] = value;
        size++;

    }

    public int dequeue() {

        if (this.getSize() == 0)
        {
            System.out.println("No elements to remove");
            return 0;    
        }

        int value = array[0];
        
        int[] temp = new int[this.capacity];

        for (int i = 0; i < size - 1; i++)
        {
            temp[i] = array[i + 1];
        }

        array = temp;
        size--;

        return value;

    }

    public int get(int index) {

        return this.array[index];

    }

    public int getCapacity() {

        return this.capacity;

    }

    public int getSize() {

        return this.size;

    }

}
