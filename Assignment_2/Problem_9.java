import java.util.*;

public class Problem_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue queue_1 = new Queue();

        for (int i = 1; i <= 20; i++)
        {
            queue_1.enqueue(i);
        }

        System.out.println("The numbers being removed in chronological order are:");

        while (queue_1.get_size() > 0)
        {
            System.out.println(queue_1.dequeue());    
        }

        scanner.close();

    }

}

class Queue {

    private ArrayList<Integer> elements;
    /* size data field is unnecessary since ArrayList is being used
       and the Queue is dynamic */

    public Queue() {

        this.elements = new ArrayList<>();

    }

    public Queue(ArrayList<Integer> array_list) {

        for (int i = 0; i < array_list.size(); i++) {

            this.elements.add(array_list.get(i));

        }

    }

    public void enqueue(int num) {

        this.elements.add(num);

    }

    public int dequeue() {

        int temp = this.elements.get(0);

        this.elements.remove(0);

        return temp;

    }

    public int peek() {

        return this.elements.get(0);

    }

    public boolean is_empty() {

        return this.elements.isEmpty();

    }

    public int get_size() {

        return this.elements.size();

    }

    public void clear() {

        this.elements.clear();

    }

    public void print_queue() {

        for(int i = 0; i < this.elements.size(); i++) {

            System.out.println(this.elements.get(i));

        }

    }

    public boolean contains(int num) {

        for (int i = 0; i < this.elements.size(); i++) {

            if (this.elements.get(i) == num)
            {
                return true;
            }

        }

        return false;

    }

    public static void copy_list(ArrayList<Integer> array_list1, ArrayList<Integer> array_list2) {

        for(int i = 0; i < array_list1.size(); i++) {

            array_list2.add(array_list1.get(i));

        }

    }

    public void reverse_queue() {

        Collections.reverse(elements);

    }

}
