import java.util.*;

public class Problem_1 {

    public static void main(String[] args) {


    }

}

class Point2D {

    private double x;
    private double y;

    public double get_x() {

        return this.x;

    }

    public double get_y() {

        return this.y;

    }

}

class Line {

    private Point2D point_1;
    private Point2D point_2;

    public Line(Point2D point_1, Point2D point_2) {

        this.point_1 = point_1;
        this.point_2 = point_2;

    }

    public Line() {

    }

    public Point2D get_point_1() {

        return this.point_1;

    }

    public Point2D get_point_2() {

        return this.point_2;

    }

    public String to_string() {

        String str = "X1: " + this.point_1.get_x() + ", Y1: " + this.point_1.get_y() + ", X2: " + this.point_2.get_x() + ", " + this.point_2.get_y();
        return str;

    }

    public double find_slope() {

        double slope = (this.point_1.get_y() - this.point_2.get_y()) / (this.point_1.get_x() - this.point_2.get_x());
        return slope;

    }

    public boolean is_intersecting(Line line_1, Line line_2) {

        double slope_1 = line_1.find_slope();
        double slope_2 = line_2.find_slope();

        return ((slope_1 != slope_2) ? true : false);

    }

}
