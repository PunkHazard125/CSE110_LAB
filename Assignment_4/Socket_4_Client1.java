import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.Scanner;

public class Socket_4_Client1 {

    public static void main(String[] args) {

        try
        (
            Socket socket = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ) 
        {
            System.out.print("Enter a character: ");
            char ch = (char) in.read();
            out.print(ch);
            System.out.println("Character sent to server.");

            Random random = new Random();
            int num = random.nextInt(100);
            System.out.println("Sending random number: " + num);
            out.print(num);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
