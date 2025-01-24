import java.util.*;
import java.math.*;
import java.io.*;
import java.net.*;

public class Client {

    public static void sendMessage(String message, BufferedReader in, PrintWriter out) throws IOException {

        out.println(message);
        String response = in.readLine();
        System.out.println(response);

    }
    
    public static void main(String[] args) {
        
        try
        (
            Socket socket = new Socket("localhost", 12345);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        ) 
        {
            System.out.println("Connected to server, type your messages: \n");
            
            String message;

            while ((message = consoleReader.readLine()) != null)
            {
                if (message.equalsIgnoreCase("Exit"))
                {
                    System.out.println("Exited!");
                    break;    
                }
                else
                {
                    sendMessage(message, in, out);
                    System.out.println();
                }
            }
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        
    }
    
}
