import java.util.*;

public class Problem_3 {

    public static void solve(Scanner scanner) {

        Random random = new Random();
        int cpu_move = random.nextInt(3);

        System.out.print("Rock(0), Paper(1), Scissor(2)\nEnter a number: ");
        int user_move = scanner.nextInt();
        if (user_move < 0 || user_move > 2)
        {
            System.out.println("Invalid Move!");
            return;    
        }

        String[] str = new String[3];
        str[0] = "Rock";
        str[1] = "Paper";
        str[2] = "Scissor";

        boolean user;

        System.out.print("Computer is " + str[cpu_move] + ". Your are " + str[user_move] + ". ");
        
        if (user_move == cpu_move)
        {
            System.out.println("Draw!");
            return;    
        }
        else if (user_move == 0)
        {
            user = (cpu_move == 2) ? true : false;   
        }
        else if (user_move == 1)
        {
            user = (cpu_move == 0) ? true : false;   
        }
        else
        {
            user = (cpu_move == 1) ? true : false;   
        }

        if (user)
        {
            System.out.println("You Won!");    
        }
        else
        {
            System.out.println("You Lost!");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();
    } 
}
