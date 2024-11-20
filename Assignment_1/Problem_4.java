import java.util.*;

public class Problem_4 {

    public static void solve(Scanner scanner) {

        double radius = 10.00;
        double x, y;

        System.out.print("Enter Value of X: ");
        x = scanner.nextDouble();
        System.out.print("Enter Value of Y: ");
        y = scanner.nextDouble();

        double distance = Math.sqrt((x * x) + (y * y));

        if (distance <= radius)
        {
            System.out.println("The point is within the circle of radius 10");
        }
        else
        {
            System.out.println("The point is outside the circle of radius 10");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
