import java.util.*;

public class Problem_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        int sum = 0;

        while (input > 0) {

            sum = sum + (input % 10);
            input = input / 10;

        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
