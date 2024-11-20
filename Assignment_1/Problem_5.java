import java.util.*;

public class Problem_5 {

    public static void solve(Scanner scanner) {

        System.out.print("Enter number of sides: ");
        int num_of_sides = scanner.nextInt();

        System.out.print("Enter length of a side: ");
        double length = scanner.nextDouble();

        double area = (num_of_sides * length * length) / (4 * (Math.tan(Math.PI / num_of_sides)));

        System.out.printf("The area of the polygon is: %.2f\n", area);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
