package ss06_kethua.exercise.point_moveablepoint.point;

import java.util.Arrays;

public class PointText {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(2,6);
        System.out.println(point);
        point.setXY(3,6);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
