import java.util.*;

public class Problem_16 {

    public static int reverse(int number) {

        String original = Integer.toString(number);
        String str = "";

        for (int i = original.length() - 1; i >= 0; i--)
        {
            str += original.charAt(i);
        }

        int result = Integer.parseInt(str);

        return result;

    }
    
    public static boolean is_palindrome(int number) {

        int reversed = reverse(number);

        if (reversed == number)
        {
            return true;    
        }
        else
        {
            return false;
        }

    }

    public static void solve(Scanner scanner) {

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (is_palindrome(number))
        {
            System.out.println("It is a palindrome number");    
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
