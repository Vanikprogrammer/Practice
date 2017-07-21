package function;

import java.util.Random;

/**
 * Created by 1 on 21.07.2017.
 */
public class CircleGenerator {
    private Circle[] circles;

    public void generate(int countOfCircles){
        double a = 0;
        double b = 10;
        for(int i = 0; i < countOfCircles; i++){
            Point p = new Point(a + (int) (Math.random() * b),a + (int) (Math.random() * b));
            circles[i] = new Circle(a + (int) (Math.random() * b),p.calcLength(5,));

        }
    }
    public void info(){
        for(int i = 0; i < circles.length;i++){
            if(circles[i].collisionCheck())
        }
    }


}
