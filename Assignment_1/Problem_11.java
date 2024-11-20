import java.util.*;

public class Problem_11 {

    public static void solve(Scanner scanner) {

        System.out.print("Enter loan amount: ");
        double loan = scanner.nextDouble();
        System.out.print("Enter time period in years: ");
        int time = scanner.nextInt();

        int total_payments = time * 12;

        System.out.printf("%-20s%-20s%-20s%n", "Interest Rate", "Monthly Payment", "Total Payment");

        for (double rate = 5.0; rate <= 8.00; rate += 0.125)
        {
            double monthly_rate = (rate / 100.00) / 12.00;
            double monthly_payment = (loan * monthly_rate) /
            (1 - Math.pow(1 + monthly_rate, -total_payments));

            double total_payment = monthly_payment * total_payments;

            System.out.printf("%-20.3f%-20.2f%-20.2f%n", rate, monthly_payment, total_payment);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
