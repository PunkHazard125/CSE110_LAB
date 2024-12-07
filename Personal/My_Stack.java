import java.util.*;
import java.math.*;

@SuppressWarnings("unused")

public class My_Stack {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        

        scanner.close();
    }
}

class Stack {

    private int[] array;
    private int size;
    private int capacity;

    public Stack(int capacity) {

        this.array = new int[capacity];
        this.capacity = capacity;
        this.size = 0;

    }

    public void push(int value) {

        if (size == capacity)
        {
            int[] temp = new int[capacity * 2];
            
            for (int i = 0; i < capacity; i++)
            {
                temp[i] = array[i];
            }

            array = temp;
            capacity = capacity * 2;
        }

        array[size] = value;
        size++;

    }

    public int pop() {

        if (this.getSize() == 0)
        {
            System.out.println("No elements to remove");
            return 0;    
        }

        int value = array[size - 1];
        array[size - 1] = 0;
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
