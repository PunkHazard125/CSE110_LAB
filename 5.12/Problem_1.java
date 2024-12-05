import java.util.*;

public class Problem_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ModularArithmetic test = new ModularArithmetic();

        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value of m: ");
        int m = scanner.nextInt();

        if (test.modular_inverse(a, m) != 0)
        {
            System.out.println("Modular Inverse of " + a + " and " + m + " is: " + test.modular_inverse(a, m));
        }
        else
        {
            System.out.println("Modular Inverse of " + a + " and " + m + "does not exist");
        }

        scanner.close();
        
    }
    
}

interface ArithmeticOperation {

    int modular_inverse(int a, int m);

    static int gcd(int num1, int num2) {
    
        if (num2 == 0)
        {
            return num1;
        }
        else
        {
            return gcd(num2, num1 % num2);
        }
        
    }

}

class ModularArithmetic implements ArithmeticOperation {

    @Override
    public int modular_inverse(int a, int m) {

        if (ArithmeticOperation.gcd(a, m) != 1)
        {
            return 0;
        }

        int x;

        for (x = 1; x < m; x++)
        {
            if ((a * x) % m == 1)
            {
                break;    
            }
        }

        return x;

    }

}
