import java.util.*;

public class Problem_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stack factors = new Stack();

        System.out.print("\nEnter a positive integer: ");
        int number = scanner.nextInt();

        while (number > 1)
        {
            for (int i = 2; i <= number; i++)
            {
                if (number % i == 0)
                {
                    factors.push(i);
                    number = number / i; 
                    break;   
                }    
            }    
        }

        factors.reverse_stack();

        System.out.println("\nThe factors in decreasing order are: ");
        factors.print_stack();
        System.out.println();

        scanner.close();

    }

}

class Stack {

    private ArrayList<Integer> elements;
    /* size data field is unnecessary since ArrayList is being used
       and the Stack is dynamic */

    public Stack() {

        this.elements = new ArrayList<>();

    }

    public Stack(ArrayList<Integer> array_list) {

        for (int i = 0; i < array_list.size(); i++) {

            this.elements.add(array_list.get(i));

        }

    }

    public void push(int num) {

        this.elements.add(num);

    }

    public int pop() {

        int temp = this.elements.get(this.get_size() - 1);

        this.elements.remove(this.get_size() - 1);

        return temp;

    }

    public int peek() {

        return this.elements.get(this.get_size() - 1);

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

    public void print_stack() {

        for(int i = 0; i < this.get_size(); i++) {

            System.out.println(this.elements.get(i));

        }

    }

    public boolean contains(int num) {

        return this.elements.contains(num);

    }

    public void reverse_stack() {

        Collections.reverse(elements);

    }

}
