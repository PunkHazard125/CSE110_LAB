import java.util.*;

public class Problem_5 {

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

        System.out.print("To colour the circles: ");
        c1.howToColor();

        Rectangle r1 = new Rectangle(5.0, 6.0);
        System.out.printf("Area of the rectangle: %.2f\n", r1.getArea());
        System.out.print("To colour the rectangle: ");
        r1.howToColor();

        scanner.close();
        
    }
    
}

abstract class GeometricObject {

    private String colour;
    private boolean isFilled;
    private Date dateCreated;

    protected GeometricObject() {

        this.dateCreated = new Date();

    }

    protected GeometricObject(String colour, boolean isFilled) {

        this.colour = colour;
        this.isFilled = isFilled;
        this.dateCreated = new Date();

    }

    public String getColour() {

        return this.colour;

    }

    public boolean isFilled() {

        return this.isFilled;

    }

    public Date getDateCreated() {

        return this.dateCreated;

    }

    public void setColour(String colour) {

        this.colour = colour;

    }

    public void setFilled(boolean status) {

        this.isFilled = status;

    }

    public String toString() {

        String result = "";

        result += "Colour: " + this.colour + "\n";

        if (this.isFilled())
        {
            result += "The object is filled\n";   
        }
        else
        {
            result += "The object is not filled\n";
        }

        result += "Date of Creation: " + this.dateCreated.toString() + "\n";

        return result;

    }

    abstract double getArea();
    abstract double getPerimeter();

}

class Circle extends GeometricObject implements Colourable {

    private double radius;

    public Circle() {

        super();
        this.radius = 1.0;

    }

    public Circle(double radius) {

        super();
        this.radius = radius;

    }
    
    public Circle(double radius, String colour, boolean filled) {

        super(colour, filled);
        this.radius = radius;

    }

    public double getRadius() {

        return this.radius;

    }

    public void setRadius(double r) {

        this.radius = r;

    }

    @Override
    public double getArea() {

        return (Math.PI * this.getRadius() * this.getRadius());

    }

    @Override
    public double getPerimeter() {

        return (2 * Math.PI * this.getRadius());

    }

    @Override
    public void howToColor() {

        System.out.println("Colour the circular path");

    }

}

class Rectangle extends GeometricObject implements Colourable {

    private double width;
    private double height;

    public Rectangle() {

        super();
        this.height = 1.0;
        this.width = 1.0;

    }

    public Rectangle(double width, double height) {

        super();
        this.height = height;
        this.width = width;

    }

    public Rectangle(double width, double height, String colour, boolean filled) {

        super(colour, filled);
        this.height = height;
        this.width = width;

    }

    public double getWidth() {

        return this.width;

    }
    
    public double getHeight() {

        return this.height;

    }

    public void setWidth(double w) {

        this.width = w;

    }
    
    public void setHeight(double h) {

        this.height = h;

    }

    @Override
    public double getArea() {

        return (this.getWidth() * this.getHeight());

    }

    @Override
    public double getPerimeter() {

        return 2 * (this.getWidth() + this.getHeight());

    }

    @Override
    public void howToColor() {

        System.out.println("Colour all four sides");

    }

}

interface Colourable {

    void howToColor();

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

        if (this.getArea() > test.getArea())
        {
            return 1;
        }
        else if (this.getArea() < test.getArea())
        {
            return -1;
        }
        else
        {
            return 0;
        }

    }

}
