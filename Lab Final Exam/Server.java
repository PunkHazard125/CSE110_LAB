import java.util.*;
import java.math.*;
import java.io.*;
import java.net.*;

public class Server {

    private static String lastMessage = "";

    public static String reverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            result += str.charAt(i);
        }

        return result;

    }

    public static String processMessage(String message) {

        if (message.equalsIgnoreCase(lastMessage))
        {
            return null;    
        }

        lastMessage = message;
        return "Reverse of the message is: " + reverse(message);

    }
    
    public static void main(String[] args) {
        
        try
        (
            ServerSocket serverSocket = new ServerSocket(12345);
        ) 
        {
            System.out.println("Server is running and waiting for a connection.....");

            try
            (
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            )
            {
                System.out.println("Client is connected");

                String message;

                while ((message = in.readLine()) != null)
                {
                    String response = processMessage(message);
                    
                    if (response == null)
                    {
                        out.println("Duplicate message found!");    
                    }
                    else
                    {
                        out.println(response);
                    }

                }
            }
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        
    }
    
}
