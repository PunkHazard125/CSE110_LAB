import java.util.*;
import java.awt.geom.*;

public class Problem_1 {

    public static void main(String[] args) {


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

        String str = "X1: " + this.point_1.getX() + ", Y1: " + this.point_1.getY() + ", X2: " + this.point_2.getX() + ", " + this.point_2.getY();
        return str;

    }

    public double find_slope() {

        double slope = (this.point_1.getY() - this.point_2.getY()) / (this.point_1.getX() - this.point_2.getX());
        return slope;

    }

    public boolean is_intersecting(Line line_1, Line line_2) {

        double slope_1 = line_1.find_slope();
        double slope_2 = line_2.find_slope();

        return ((slope_1 != slope_2) ? true : false);

    }

}
