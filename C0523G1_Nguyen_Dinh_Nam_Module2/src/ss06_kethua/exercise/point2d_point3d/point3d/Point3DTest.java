package ss06_kethua.exercise.point2d_point3d.point3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3.4f);
        System.out.println(point3D);
        point3D.setXYZ(3.5f,4.6f,6.9f);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }

    
}
