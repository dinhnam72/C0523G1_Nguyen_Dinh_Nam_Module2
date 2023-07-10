package ss06_kethua.exercise.point2d_point3d.point2d;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(2.5f,5.6f);
        System.out.println(point2D);
        point2D.setXY(1.3f,3.5f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }

}
