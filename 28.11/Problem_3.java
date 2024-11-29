import java.util.*;

public class Problem_3 {

    public static void main(String[] args) {
        
        Square sq = new Square();

        sq.print_sh();
        sq.print_rec();
        sq.print_sq();

    }
    
}

class Shape {

    public void print_sh() {

        System.out.println("This is a shape");

    }

}

class Rectangle extends Shape {

    public void print_rec() {

        System.out.println("This is a rectangular shape");

    }

}

class Circle extends Shape {

    public void print_cir() {

        System.out.println("This is a circular shape");

    }

}

class Square extends Rectangle {

    public void print_sq() {

        System.out.println("Square is a rectangle");

    }

}
