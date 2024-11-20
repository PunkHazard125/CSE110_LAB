import java.util.*;

public class Problem_9 {

    public static void solve(Scanner scanner) {

        Random random = new Random();
        
        String plate = "";

        for (int i = 0; i < 3; i++)
        {
            plate += (char)(random.nextInt(90 - 65 + 1) + 65);   
        }

        for (int i = 0; i < 4; i++)
        {
            plate += Integer.toString(random.nextInt(9));   
        }

        System.out.println("Randomly Generated Plate Number: " + plate);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
