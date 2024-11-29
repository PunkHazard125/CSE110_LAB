import java.util.*;

public class Problem_2 {

    public static final Integer SIZE = 10;

    public static Integer max(ArrayList<Integer> list) {
        
        if (list == null || list.size() == 0)
        {
            return null;    
        }

        Collections.sort(list);

        return list.get(list.size() - 1);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter " + SIZE + " integers: ");

        for (int i = 0; i < SIZE; i++)
        {
            list.add(scanner.nextInt());    
        }

        System.out.println("Maximum value of the list is: " + max(list));

        scanner.close();
        
    }
    
}
