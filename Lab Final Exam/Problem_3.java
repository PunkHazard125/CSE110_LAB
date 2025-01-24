import java.util.*;
import java.math.*;
import java.io.*;
import java.net.*;

public class Problem_3 {
    
    public static void main(String[] args) {

        String str = args[0];
        String filename = args[1];

        String result = "";
        String current;

        try
        (
            BufferedReader reader = new BufferedReader(new FileReader(filename));
        ) 
        {
            while ((current = reader.readLine()) != null)
            {
                if (!(current.equals(str)))
                {
                    result += current + "\n";
                }
            }
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }

        try
        (
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
        ) 
        {
            writer.write(result);
            System.out.println("Successfully removed the string.");
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        
    }
    
}
