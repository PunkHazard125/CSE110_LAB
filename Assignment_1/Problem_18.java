import java.util.*;

public class Problem_18 {

    public static int count(String str, char a) {

        int counter = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == a)
            {
                counter++;    
            }    
        }

        return counter;

    }

    public static void solve(Scanner scanner) {

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character: ");
        String c = scanner.next();
        char a = c.charAt(0);

        int result = count(str, a);
        System.out.println("The character occurs " + result + " time(s) in the string.");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
