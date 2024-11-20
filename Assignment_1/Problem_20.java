import java.util.*;

public class Problem_20 {

    public static double min(double[] array) {

        double result = array[0];

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < result)
            {
                result = array[i];    
            }    
        }

        return result;

    }

    public static void solve(Scanner scanner) {

        double[] array = new double[10];
        
        System.out.print("Enter ten double values: ");
        
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextDouble();    
        }

        System.out.printf("Minimum value: %.1f\n", min(array));

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
