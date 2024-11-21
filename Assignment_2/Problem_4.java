import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter value of d: ");
        double d = scanner.nextDouble();
        System.out.print("Enter value of e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter value of f: ");
        double f = scanner.nextDouble();

        LinearEquation system_1 = new LinearEquation(a, b, c, d, e, f);

        if (system_1.isSolvable())
        {
            double x = system_1.get_x();
            double y = system_1.get_y();

            System.out.printf("Value of X: %.2f\nValue of Y: %.2f\n", x, y);
        }
        else
        {
            System.out.println("The equation has no solution.");
        }

        scanner.close();
    }
    
}

class LinearEquation {

    private double a, b, c, d, e, f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }

    public double get_a() {

        return this.a;

    }

    public double get_b() {

        return this.b;

    }

    public double get_c() {

        return this.c;

    }

    public double get_d() {

        return this.d;

    }

    public double get_e() {

        return this.e;

    }

    public double get_f() {

        return this.f;

    }

    public boolean isSolvable() {

        if ((get_a() * get_d()) - (get_b() * get_c()) != 0.00)
        {
            return true;    
        }
        else
        {
            return false;
        }

    }

    public double get_x() {

        double x = ((get_e() * get_d()) - (get_b() * get_f())) / ((get_a() * get_d()) - (get_b() * get_c()));
        return x;

    }

    public double get_y() {

        double y = ((get_a() * get_f()) - (get_e() * get_c())) / ((get_a() * get_d()) - (get_b() * get_c()));
        return y;

    }

}
