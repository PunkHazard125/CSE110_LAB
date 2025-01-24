import java.io.*;
import java.net.*;

public class Socket_4_Server {

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5000)) 
        {
            System.out.println("Server is running...");

            Socket client1 = serverSocket.accept();
            System.out.println("Client1 connected.");

            Socket client2 = serverSocket.accept();
            System.out.println("Client2 connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(client1.getInputStream()));
            PrintWriter out = new PrintWriter(client2.getOutputStream(), true);

            char receivedChar = (char) in.read();
            char modifiedChar = (char) (receivedChar - 1);
            out.println(modifiedChar);
            System.out.println("Received character: " + receivedChar + "; Sent to Client2: " + modifiedChar);

            int number = Integer.parseInt(in.readLine());
            int nextNumber = number + 2;
            out.println(nextNumber);
            System.out.println("Received number: " + number + "; Sent to Client2: " + nextNumber);

            in.close();
            out.close();
            client1.close();
            client2.close();
            
            System.out.println("Server shutting down...");

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
