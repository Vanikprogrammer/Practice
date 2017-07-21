package function;

/**
 * Created by 1 on 21.07.2017.
 */
public class Circle {
   private double radius;
   private Point point;

   public Circle(double radius, Point p){
       this.radius = radius;
       this.point = p;
   }

    public double getRadius() {
        return radius;
    }

    public Point getPoint() {
        return point;
    }

    public boolean collisionCheck(Circle c1, Circle c2){
       if(c1.getRadius() + c2.getRadius() <= c1.point.calcLength(c1.getPoint(),c2.getPoint())){
           return  true;
       }else  return false;

   }
}
