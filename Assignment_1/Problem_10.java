import java.util.*;

public class Problem_10 {

    public static void solve(Scanner scanner) {

        System.out.println("ASCII Characters:\n");

        char start = '!', end = '~';

        while (start <= end)
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
