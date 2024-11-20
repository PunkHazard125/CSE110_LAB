import java.util.*;

public class Problem_12 {

    public static void solve(Scanner scanner) {

        double e, factorial = 1.0;

        for (long limit = 10000; limit <= 100000; limit += 10000)
        {
            e = 2.0;
            factorial = 1.0;
            
            for (long i = 2; i <= limit; i++)
            {
                factorial *= i;
                e += (1.0 / factorial);    
            }

            System.out.printf("Value of e when i = %d is: %.5f\n", limit, e);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
