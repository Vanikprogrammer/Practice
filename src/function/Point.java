package function;

/**
 * Created by 1 on 21.07.2017.
 */
public class Point {
    private double x, y;

    public Point(){

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calcLength(Point p1, Point p2){
        return Math.sqrt((Math.pow(p1.getX() - p2.getX(), 2)) + (Math.pow(p1.getY() - p2.getY(), 2)));
    }



}
