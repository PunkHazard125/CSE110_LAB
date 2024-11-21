import java.util.*;

public class Problem_7 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        MyPoint point_1 = new MyPoint();
        MyPoint point_2 = new MyPoint(10, 30.5);

        double distance = point_1.distance(point_2);

        System.out.printf("Distance between the points is: %.2f\n", distance);

        scanner.close();
    }
    
}

class MyPoint {

    private double x;
    private double y;

    MyPoint() {

        this.x = 0.0;
        this.y = 0.0;

    }

    MyPoint(double x, double y) {

        this.x = x;
        this.y = y;

    }

    public double get_x() {

        return this.x;

    }

    public double get_y() {

        return this.y;

    }

    public double distance(MyPoint point) {


        double x1 = this.get_x();
        double y1 = this.get_y();

        double x2 = point.get_x();
        double y2 = point.get_y();

        double result = Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)));

        return result;

    }

    public double distance(double x2, double y2) {


        double x1 = this.get_x();
        double y1 = this.get_y();

        double result = Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)));

        return result;

    }

}
