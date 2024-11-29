import java.util.*;

public class Problem_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Rectangle rec = new Rectangle(5, 10);
        Square sq = new Square(20);

        rec.printArea();
        rec.printPerimeter();

        sq.printArea();
        sq.printPerimeter();

        ArrayList<Square> sq_list = new ArrayList<>();

        System.out.println("Creating 10 Squares");

        for (int i = 0; i < 10; i++)
        {
            System.out.print("\nEnter side: ");
            sq_list.add(new Square(scanner.nextDouble()));

            if (sq_list.get(i).length < 0)
            {
                sq_list.remove(i);
                System.out.println("Side cannot be negative!");
                continue;

            }

            sq_list.get(i).printArea();
            sq_list.get(i).printPerimeter();
                
        }

        scanner.close();

    }
    
}

class Rectangle {

    public double length;
    public double width;

    public Rectangle() {

    }

    public Rectangle(double len, double wid) {

        this.length = len;
        this.width = wid;

    }

    public void printArea() {

        System.out.printf("Area: %.2f\n", (this.length * this.width));

    }

    public void printPerimeter() {

        System.out.printf("Perimeter: %.2f\n", ((2 * (this.length + this.width))));

    }

}

class Square extends Rectangle {

    public Square() {

    }

    public Square(double s) {

        super(s, s);

    }

}
