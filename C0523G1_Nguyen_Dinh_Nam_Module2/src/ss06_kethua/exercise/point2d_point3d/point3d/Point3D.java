package ss06_kethua.exercise.point2d_point3d.point3d;

import ss06_kethua.exercise.point2d_point3d.point2d.Point2D;

public class Point3D extends Point2D {
    private float z;
    public Point3D(){

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }
    public float [] getXYZ(){
        float arr3D[] = {getX(),getY(),getZ()};
        return arr3D;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() +
                '}';
    }
}
