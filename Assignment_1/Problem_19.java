import java.util.*;

public class Problem_19 {

    public static int average(int[] array) {

        int result = 0;

        for (int i = 0; i < array.length; i++)
        {
            result += array[i];    
        }

        result = result / array.length;

        return result;

    }

    public static double average(double[] array) {

        double result = 0.0;

        for (int i = 0; i < array.length; i++)
        {
            result += array[i];    
        }

        result = result / array.length;

        return result;

    }

    public static void solve(Scanner scanner) {

        int[] array_int = new int[10];
        double[] array_dbl = new double[10];

        System.out.print("Enter ten integer values: ");
        
        for (int i = 0; i < array_int.length; i++)
        {
            array_int[i] = scanner.nextInt();    
        }

        System.out.println("Average: " + average(array_int));
        
        System.out.print("Enter ten double values: ");
        
        for (int i = 0; i < array_int.length; i++)
        {
            array_dbl[i] = scanner.nextDouble();    
        }

        System.out.printf("Average: %.2f\n", average(array_dbl));

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
