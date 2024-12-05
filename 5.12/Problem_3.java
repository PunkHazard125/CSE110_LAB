import java.util.*;
import java.awt.geom.*;

public class Problem_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ComparableCircle c1 = new ComparableCircle(5.0);
        ComparableCircle c2 = new ComparableCircle(10.0);

        if (c1.compareTo(c2) > 0)
        {
            System.out.println("Circle 1 is larger");    
        }
        else if (c1.compareTo(c2) < 0)
        {
            System.out.println("Circle 2 is larger");    
        }
        else
        {
            System.out.println("The area of the circles is equal");
        }

        scanner.close();
        
    }
    
}

class Circle {

    private Point2D center;
    private double radius;

    Circle() {

        this.center = new Point2D.Double();
        this.center.setLocation(0, 0);
        this.radius = 1.0;

    }
    
    Circle(double radius) {

        this.center = new Point2D.Double();
        this.center.setLocation(0, 0);
        this.radius = radius;

    }

    public double get_x() {

        return this.center.getX();

    }

    public double get_y() {

        return this.center.getY();

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

}


class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {

        super();

    }

    public ComparableCircle(double radius)
    {

        super(radius);

    }

    @Override
    public int compareTo(ComparableCircle test) {

        if (this.get_area() > test.get_area())
        {
            return 1;
        }
        else if (this.get_area() < test.get_area())
        {
            return -1;
        }
        else
        {
            return 0;
        }

    }

}
