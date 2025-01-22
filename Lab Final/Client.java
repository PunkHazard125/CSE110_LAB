import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) 
            
            {

            System.out.println("Connected to the server. Type your messages:\n");

            String message;

            while ((message = consoleReader.readLine()) != null) 
            {
                if (message.equalsIgnoreCase("exit")) 
                {
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }
                
                sendMessage(message, out, in);
            }

        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }

    }

    public static void sendMessage(String message, PrintWriter out, BufferedReader in) throws IOException {

        out.println(message);
        String response = in.readLine();
        System.out.println("Server response: " + response);
        
    }

}
