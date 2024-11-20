import java.util.*;

public class Problem_15 {

    public static void solve(Scanner scanner) {

        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = scanner.nextDouble();    
        }

        double base_sum = 0.0, sq_sum = 0.0, mean, std_dev;

        for (int i = 0; i < numbers.length; i++)
        {
            base_sum += numbers[i];
            sq_sum += (numbers[i] * numbers[i]);
        }

        mean = base_sum / 10.0;
        std_dev = Math.sqrt((sq_sum - ((base_sum * base_sum) / 10.0)) / 9.00);

        System.out.printf("The mean is: %.2f\n", mean);
        System.out.printf("The standard deviation is: %.5f\n", std_dev);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
