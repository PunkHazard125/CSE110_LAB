import java.util.*;

public class Problem_5 {

    public static Location locate_largest(double[][] array) {

        Location location = new Location();

        double max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                if (array[i][j] > max)
                {
                    max = array[i][j];
                    location.max_value = max;
                    location.row = i;
                    location.col = j;
                }   
            }    
        }

        return location;

    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int col = scanner.nextInt();

        double[][] array = new double[row][col];

        System.out.println("\nEnter the values: ");

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                array[i][j] = scanner.nextDouble();    
            }    
        }

        Location location = locate_largest(array);

        System.out.println("Location of the largest element " + location.max_value + " is: (" + location.row + ", " + location.col + ")");

        scanner.close();
    }
    
}

class Location {

    public int row;
    public int col;
    public double max_value;

}
