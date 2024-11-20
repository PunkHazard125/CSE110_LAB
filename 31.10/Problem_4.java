import java.util.*;

public class Problem_4 {

    public static int previous_prime(int number) {

        boolean is_prime = true;

        for (int i = number; i > 1; i--)
        {
            is_prime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0)
                {
                    is_prime = false;
                    break;
                }
            }

            if (is_prime)
            {
                number = i;
                break;
            }
        }

        return number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = previous_prime(number);
        System.out.println("Prime Number: " + result);

        scanner.close();
    }
}
