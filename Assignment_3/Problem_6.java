import java.util.*;

public class Problem_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Octagon o1 = new Octagon(5.0);
        System.out.printf("Area: %.2f\n", o1.getArea());
        System.out.printf("Perimeter: %.2f\n", o1.getPerimeter());

        Octagon o2 = (Octagon)(o1.clone());

        if (o1.compareTo(o2) > 0)
        {
            System.out.println("Octagon 1 is larger");    
        }
        else if (o1.compareTo(o2) < 0)
        {
            System.out.println("Octagon 2 is larger");    
        }
        else
        {
            System.out.println("The octagons have equal area");
        }

        scanner.close();
        
    }
    
}

abstract class GeometricObject {

    private String colour;
    private boolean isFilled;
    protected Date dateCreated;

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

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

    private double side;

    public Octagon() {

        super();
        this.side = 1.0;

    }

    public Octagon(double side) {

        super();
        this.side = side;

    }

    public Octagon(double side, String colour, boolean filled) {

        super(colour, filled);
        this.side = side;

    }

    public double getSide() {

        return this.side;

    }

    public void setSide(double s) {

        this.side = s;

    }

    @Override
    public double getArea() {

        return (this.getSide() * this.getSide() * (2.00 + (4.00 / Math.sqrt(2))));

    }

    @Override
    public double getPerimeter() {

        return (8 * this.getSide());

    }

    @Override
    public int compareTo(Octagon test) {

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

    @Override
    public Object clone() {

        try {

            Octagon oc_clone = (Octagon)super.clone();
            oc_clone.dateCreated = (Date)dateCreated.clone();
    
            return oc_clone;

        } catch (Exception e) {

            System.out.println("The object cannot be cloned");
            return null;

        }

    }

}
