import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        try
        (
            Socket socket = new Socket("localhost", 12345);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        )
        {
            System.out.println("Connected to the server. Type your messsages: \n");

            String message;

            while ((message = consoleReader.readLine()) != null)
            {
                if (message.equalsIgnoreCase("Exit"))
                {
                    System.out.println("Exiting the program!");
                    break;    
                }
                
                sendMessage(message, in, out);   
            }
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }

    }

    public static void sendMessage(String message, BufferedReader in, PrintWriter out) throws IOException {

        out.println(message);
        String response = in.readLine();
        System.out.println("Server Response: " + response);

    }

}
