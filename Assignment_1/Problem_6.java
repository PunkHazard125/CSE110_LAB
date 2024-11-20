import java.util.*;

public class Problem_6 {

    public static void solve(Scanner scanner) {

        System.out.print("Enter a character: ");
        String input = scanner.next();

        int unicode = (int)(input.charAt(0));

        System.out.println("Unicode of " + input.charAt(0) + " is " + unicode);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
