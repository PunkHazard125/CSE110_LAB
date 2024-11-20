import java.util.*;

public class Problem_8 {

    public static void solve(Scanner scanner) {

        String[] cities = new String[3];

        for (int index = 0; index < cities.length; index++) {

            System.out.print("Enter name of City " + (index + 1) + ": ");
            cities[index] = scanner.nextLine();

        }

        Arrays.sort(cities);
        
        System.out.println("The three cities in alphabetical order are : ");
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
