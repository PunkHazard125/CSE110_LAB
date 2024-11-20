import java.util.*;

public class Problem_2 {

    public static void solve(Scanner scanner) {

        String rand_num = "" + (int)(Math.random() * (10)) + (int)(Math.random() * (10)) + (int)(Math.random() * (10));
        
        System.out.print("Enter a 3-Digit Number: ");
        String input = scanner.next();

        char[] lottery = rand_num.toCharArray();
        char[] user = input.toCharArray();

        if (rand_num.equals(input))
        {
            System.out.println("Congratulations! You have won $10,000");
            return;    
        }

        Arrays.sort(lottery);
        Arrays.sort(user);

        if (Arrays.equals(lottery, user))
        {
            System.out.println("Congratulations! You have won $3,000");
            return; 
        }
        else
        {
            for (int i = 0; i < user.length; i++)
            {
                for (int j = 0; j < lottery.length; j++)
                {
                    if (lottery[j] == user[i])
                    {
                        System.out.println("COngratulations! You have won $1,000");
                        return;
                    }    
                }    
            }
        }

        System.out.println("Sorry! You did not win the lottery.");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();
    } 
}
