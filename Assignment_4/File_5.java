import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.math.*;

@SuppressWarnings("unused")

public class File_5 {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name with extension: ");
        String fileName = scanner.nextLine();

        int[] count = new int[26];
        for (int i = 0; i < count.length; i++)
        {
            count[i] = 0;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                line = line.toUpperCase();

                for (int i = 0; i < line.length(); i++)
                {
                    char current = line.charAt(i);

                    if (current >= 'A' && current <= 'Z')
                    {
                        count[current - 'A']++;    
                    }
                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        System.out.println("Count of letters in the file: ");

        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.println(ch + ": " + count[ch - 'A']);
        }

        scanner.close();
    }
}
