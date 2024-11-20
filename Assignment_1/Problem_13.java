import java.util.*;

public class Problem_13 {

    public static int decimal_to_octal(int dec) {

        int oct = 0;
        int base = 1;
    
        while (dec > 0) {
    
            int remainder = dec % 8;
            oct = oct + remainder * base;
            dec = dec / 8;
            base = base * 10;
            
        }
    
        return oct;
    }

    public static void solve(Scanner scanner) {

        System.out.print("Enter a decimal number: ");
        int dec = scanner.nextInt();

        int octal = decimal_to_octal(dec);

        System.out.println("The corresponding octal number is: " + octal);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
