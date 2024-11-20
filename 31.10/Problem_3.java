import java.util.*;

public class Problem_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius = 10.00;
        double x, y;

        System.out.print("Enter value of x: ");
        x = scanner.nextDouble();
        System.out.print("Enter value of y: ");
        y = scanner.nextDouble();

        double distance = Math.sqrt((x * x) + (y * y));

        if (distance <= radius)
        {
            System.out.println("The point is within the circle");
        }
        else
        {
            System.out.println("The point is not within the circle");
        }

        scanner.close();
    }
}
