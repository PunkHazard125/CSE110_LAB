import java.io.*;
import java.net.*;

public class Server {

    private static String lastMessage = "";

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(12345))
        {
            System.out.println("Server is running and waiting for a connection.....");
            
            try
            (
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            ) 
            {

                System.out.println("Client connected.");
                
                String message;

                while ((message = in.readLine()) != null)
                {
                    String response = processMessage(message);
                    
                    if (response == null)
                    {
                        out.println("No response, repeated message.");    
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

    public static String processMessage(String message) {

        if (message.equals(lastMessage))
        {
            return null;    
        }

        lastMessage = message;
        return "Message Length: " + message.length();

    }

}
