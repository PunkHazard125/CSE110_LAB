import java.util.*;

public class Problem_1 {

    public static void main(String[] args) throws InputMismatchException {

        Scanner sc = new Scanner(System.in);
        
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();
        Calculator obj3 = new Calculator();
        Calculator obj4 = new Calculator();

        System.out.println("\nAddition\n");

        try {

            System.out.print("Enter number 1: ");
            obj1.setNum1(sc.nextDouble());
            System.out.print("Enter number 2: ");
            obj1.setNum2(sc.nextDouble());

            System.out.println("Result: " + obj1.add());

        }
        catch (InputMismatchException ex)
        {
            System.out.println(ex);
            sc.next(); //Clears invalid input of mismatched type
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("\nSubtraction\n");

        try {

            System.out.print("Enter number 1: ");
            obj2.setNum1(sc.nextDouble());
            System.out.print("Enter number 2: ");
            obj2.setNum2(sc.nextDouble());

            System.out.println("Result: " + obj2.subtract());
        }
        catch (InputMismatchException ex)
        {
            System.out.println(ex);
            sc.next(); //Clears invalid input of mismatched type
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("\nMultiplication\n");

        try {

            System.out.print("Enter number 1: ");
            obj3.setNum1(sc.nextDouble());
            System.out.print("Enter number 2: ");
            obj3.setNum2(sc.nextDouble());

            System.out.println("Result: " + obj3.multiply());
        }
        catch (InputMismatchException ex)
        {
            System.out.println(ex);
            sc.next(); //Clears invalid input of mismatched type
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex);
        }

        System.out.println("\nDivision\n");

        try {

            System.out.print("Enter number 1: ");
            obj4.setNum1(sc.nextDouble());
            System.out.print("Enter number 2: ");
            obj4.setNum2(sc.nextDouble());

            System.out.println("Result: " + obj4.divide());
        }
        catch (InputMismatchException ex)
        {
            System.out.println(ex);
            sc.next(); //Clears invalid input of mismatched type
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }

        sc.close();

    }
}

class Calculator {

    private double num1;
    private double num2;

    public Calculator() {

    }

    public Calculator(double num1, double num2) {

        this.num1 = num1;
        this.num2 = num2;

    }

    public double getNum1() {

        return this.num1;

    }

    public double getNum2() {

        return this.num2;

    }
    
    public void setNum1(double num1) {

        this.num1 = num1;

    }

    public void setNum2(double num2) {

        this.num2 = num2;

    }

    public double add() throws ArithmeticException {

        if (num1 + num2 <= 0.0)
        {
            throw new ArithmeticException("Sum cannot be zero or negative");    
        }

        return num1 + num2;
    }

    public double subtract() throws ArithmeticException {

        if (num1 + num2 <= 0.0)
        {
            throw new ArithmeticException("Sum cannot be zero or negative");    
        }

        return num1 - num2;
    }

    public double multiply() throws ArithmeticException {

        if (num1 == 0.00 || num2 == 0.00)
        {
            throw new ArithmeticException("None of the numbers can be zero");    
        }

        return num1 * num2;
    }

    public double divide() throws ArithmeticException {

        if (num1 == 0.00 || num2 == 0.00)
        {
            throw new ArithmeticException("None of the numbers can be zero");    
        }

        return num1 / num2;
    }

}
