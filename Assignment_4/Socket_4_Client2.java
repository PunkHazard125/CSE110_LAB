import java.io.*;
import java.net.*;

public class Socket_4_Client2 {

    public static void main(String[] args) {
        try 
        (
            Socket socket = new Socket("localhost", 5000);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) 
        {
            String charReceived = in.readLine(); // Read as a full line
            if (charReceived != null && !charReceived.isEmpty()) 
            {
                System.out.println("Received character from server: " + charReceived);
            }

            String numberReceived = in.readLine();
            if (numberReceived != null && !numberReceived.isEmpty()) 
            {
                int receivedNum = Integer.parseInt(numberReceived);
                System.out.println("Received number from server: " + receivedNum);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
