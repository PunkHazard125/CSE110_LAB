import java.util.*;
import java.math.*;
import java.io.*;
import java.net.*;

public class Problem_1 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[50];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(100) + 1;    
        }

        int index;

        try 
        {
            System.out.print("Enter an index: ");
            index = scanner.nextInt();

            if (index < 0 || index > 50)
            {
                throw new InvalidIndexException("Index out of bounds!");
            }
            else
            {
                System.out.println("Element at index " + index + " is: " + array[index]);
            }

            scanner.close();
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Invalid input! Please enter an integer.");
        }
        catch (InvalidIndexException e)
        {
            e.printStackTrace();
        }
        
    }
    
}

class InvalidIndexException extends Exception {

    public InvalidIndexException(String message) {

        super(message);

    }

}
