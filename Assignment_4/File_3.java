import java.util.*;
import java.io.*;
import java.math.*;
import java.net.*;

@SuppressWarnings("unused")

public class File_3 {
    
    public static void main(String args[]) {

        try 
        {
            int words = 0;
            
            URL url = new URL("https://www.abrahamlincolnonline.org/lincoln/speeches/gettysburg.htm");
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) 
            {
                scanner.next();
                words++;
            }

            System.out.println();

            System.out.println("Total words are: " + words);

            System.out.println();

            scanner.close();

        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
}
