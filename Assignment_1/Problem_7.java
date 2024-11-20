import java.util.*;

public class Problem_7 {

    public static int hex_to_dec(String hex) {

        int dec = 0, expo = 0;
    
        String letters = "ABCDEF";

        for (int i = hex.length() - 1; i >= 0; i--)
        {
            if (Character.isDigit(hex.charAt(i)))
            {
                dec += (int)(Character.getNumericValue(hex.charAt(i)) * Math.pow(16, expo));
            }
            else
            {
                dec += (int)((letters.indexOf(hex.charAt(i)) + 10) * Math.pow(16, expo));
            }
            expo++;  
        }
    
        return dec;

    }

    public static String dec_to_bin(int dec) {

        if (dec == 0)
        {
            return "0";
        }
        
        String bin = "";

        while (dec > 0)
        {
            int remainder = dec % 2;
            bin = remainder + bin;
            dec = dec / 2;
        }

        return bin;
    }

    public static void solve(Scanner scanner) {

        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.next();

        String binary = dec_to_bin(hex_to_dec(hex));

        System.out.println("The corresponding binary number is: " + binary);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
