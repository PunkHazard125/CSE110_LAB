import java.util.*;
import java.io.*;
import java.math.*;
import java.net.*;

@SuppressWarnings("unused")

public class File_2 {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        File file = new File("Test.txt");

        int words = 0, characters = 0, lines = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) 
        {
            String line;

            while ((line = reader.readLine()) != null) 
            {
                lines++;

                String[] word = line.split("\\s+");

                for (String w : word)
                {
                    if (!w.isEmpty()) 
                    {
                        words++;
                    }    
                }

                characters += line.length();
            }
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }

        System.out.println();

        System.out.println("Statistics:\n");
        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);

        System.out.println();

        scanner.close();
    }
}
