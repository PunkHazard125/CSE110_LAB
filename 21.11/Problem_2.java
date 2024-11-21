import java.util.*;

public class Problem_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.printf("Area of C1: %.2f\n", c1.get_area());
        System.out.printf("Perimeter of C1: %.2f\n", c1.get_perimeter());

        if (c1.contains(3, 3))
        {
            System.out.println("C1 contains the point");
        }
        else
        {
            System.out.println("C1 does not contain the point");
        }

        if (c1.contains(new Circle2D(4, 5, 10.5)))
        {
            System.out.println("C1 contains the circle");
        }
        else
        {
            System.out.println("C1 does not contain the circle");
        }

        if (c1.overlaps(new Circle2D(3, 5, 2.3)))
        {
            System.out.println("The circles overlap");
        }
        else
        {
            System.out.println("The circles do not overlap");
        }

        scanner.close();
    }

}

class Circle2D extends Point2D{

    private double x;
    private double y;
    private double radius;

    Circle2D() {

        this.x = 0;
        this.y = 0;
        this.radius = 1.0;

    }

    Circle2D(double x, double y, double r) {

        this.x = x;
        this.y = y;
        this.radius = r;

    }

    public double get_x() {

        return this.x;

    }

    public double get_y() {

        return this.y;

    }

    public double get_radius() {

        return this.radius;

    }

    public double get_area() {

        double area = Math.PI * Math.pow(this.radius, 2);
        return area;

    }

    public double get_perimeter() {

        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;

    }

    public double distance(double x1, double y1, double x2, double y2) {

        double result = Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)));

        return result;

    }

    public boolean contains(double x, double y) {

        double distance = distance(this.get_x(), this.get_y(), x, y);

        return ((distance <= this.get_radius()) ? true : false);

    }

    public boolean contains(Circle2D circle) {

        double distance = distance(this.get_x(), this.get_y(), circle.get_x(), circle.get_y());

        return ((distance + circle.get_radius() < this.get_radius()) ? true : false);

    }

    public boolean overlaps(Circle2D circle) {

        double distance = distance(this.get_x(), this.get_y(), circle.get_x(), circle.get_y());

        if (Math.abs(this.get_radius() - circle.get_radius()) <= distance || this.radius + circle.get_radius() >= distance)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
