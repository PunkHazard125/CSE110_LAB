import java.util.*;

public class Problem_4 {

    public static final Integer SIZE = 5;

    public static void sort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i) > list.get(j))
                {
                    Collections.swap(list, i, j);
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter " + SIZE + " Integers: ");

        for (int i = 0; i < SIZE; i++)
        {
            list.add(scanner.nextInt());    
        }

        sort(list);

        System.out.print("Sorted List: ");
        System.out.println(list);

        scanner.close();
        
    }
    
}
