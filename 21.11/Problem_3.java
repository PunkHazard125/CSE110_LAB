import java.util.*;

public class Problem_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of Queue: ");
        int size = scanner.nextInt();

        Queue queue_1 = new Queue(size);

        System.out.println("Enter elements of the Queue: ");
        for (int i = 0; i < size; i++) {

            queue_1.enqueue(scanner.nextInt());

        }

        System.out.println("\nQueue: ");

        queue_1.print_queue();

        System.out.println("\nQueue After Dequeue: ");

        queue_1.dequeue();

        queue_1.print_queue();

        System.out.println("\nCurrent Front Element: " + queue_1.peek());

        System.out.println("\nReversed Queue: ");
        queue_1.reverse_queue();
        queue_1.print_queue();
        System.out.println();

        scanner.close();

    }

}

class Queue {


    private int front;
    private int rear;
    private int size;
    private ArrayList<Integer> list_of_elements;

    public Queue() {

    }

    public Queue(int size) {

        this.size = size;
        this.list_of_elements = new ArrayList<>(size);

    }

    public Queue(ArrayList<Integer> array_list) {

        for (int i = 0; i < array_list.size(); i++) {

            this.list_of_elements.add(array_list.get(i));

        }

        this.front = this.list_of_elements.getFirst();
        this.rear = this.list_of_elements.getLast();
        this.size = this.list_of_elements.size();

    }

    public void enqueue(int num) {

        this.list_of_elements.add(num);
        this.front = this.list_of_elements.getFirst();
        this.rear = this.list_of_elements.getLast();

    }

    public void dequeue() {

        this.list_of_elements.removeFirst();
        this.front = this.list_of_elements.getFirst();
        this.rear = this.list_of_elements.getLast();

    }

    public int peek() {

        return this.list_of_elements.getFirst();

    }

    public boolean is_empty() {

        return this.list_of_elements.isEmpty();

    }

    public boolean is_full() {

        if (this.get_size() == this.list_of_elements.size())
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public int get_size() {

        return this.size;

    }

    public void clear() {

        this.list_of_elements.clear();

    }

    public void print_queue() {

        for(int i = 0; i < this.list_of_elements.size(); i++) {

            System.out.println(this.list_of_elements.get(i));

        }

    }

    public boolean contains(int num) {

        for (int i = 0; i < this.list_of_elements.size(); i++) {

            if (this.list_of_elements.get(i) == num)
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

        ArrayList<Integer> temp_list = new ArrayList<>(this.list_of_elements.size());
        copy_list(this.list_of_elements, temp_list);
        this.list_of_elements.clear();

        for(int i = temp_list.size() - 1; i >= 0; i--) {

            this.list_of_elements.add(temp_list.get(i));

        }

    }

}
