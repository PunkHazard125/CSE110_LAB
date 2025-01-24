import java.util.*;
import java.io.*;
import java.math.*;
import java.net.*;

@SuppressWarnings("unused")

public class File_4 {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String filename = scanner.nextLine();;

        File file = new File(filename);

        int total = 0;
        double average = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) 
        {
            String line = reader.readLine();

            if (!line.isBlank())
            {
                String[] words = line.split("\\s+");

                for (String str : words) 
                {
                    total += Integer.parseInt(str);    
                }

                average = total / words.length;
            }
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }

        System.out.println();

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        System.out.println();

        scanner.close();
    }
}
