import java.util.*;

public class Problem_2 {

    public static void shuffle(ArrayList<Integer> list) {

        Random random = new Random();

        for (int i = list.size() - 1; i > 0; i--)
        {
            int j = random.nextInt(i + 1);

            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the list: ");
        int size = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter " + size + " Integers: ");

        for (int i = 0; i < size; i++)
        {
            list.add(scanner.nextInt());    
        }

        shuffle(list);

        System.out.print("Shuffled List: ");
        System.out.println(list);

        scanner.close();
        
    }
    
}
