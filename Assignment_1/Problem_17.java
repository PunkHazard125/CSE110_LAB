import java.util.*;

public class Problem_17 {

    public static boolean strong_pass(String pass) {

        if (pass.length() < 8)
        {
            return false;    
        }

        int digit = 0;

        for (int i = 0; i < pass.length(); i++)
        {

            if (!(Character.isLetterOrDigit(pass.charAt(i))))
            {
                return false;    
            }

            if (Character.isDigit(pass.charAt(i)))
            {
                digit++;    
            }
        }

        if (digit < 2)
        {
            return false;    
        }

        return true;

    }

    public static void solve(Scanner scanner) {

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (strong_pass(password))
        {
            System.out.println("Strong Password!");    
        }
        else
        {
            System.out.println("Invalid Password!");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
