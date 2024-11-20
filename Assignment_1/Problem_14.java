import java.util.*;

public class Problem_14 {

    public static String bits(int dec) {

        String bit_str = Integer.toBinaryString(dec & 0xFFFF);

        int size = bit_str.length();

        for (int i = 0; i < 16 - size; i++)
        {
            bit_str = "0" + bit_str;    
        }

        return bit_str;

    }

    public static void solve(Scanner scanner) {

        System.out.print("Enter an integer value: ");
        int dec = scanner.nextInt();

        String bit_str = bits(dec);

        System.out.println("16-Bit Representation: " + bit_str);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        solve(scanner);

        scanner.close();

    }
}
