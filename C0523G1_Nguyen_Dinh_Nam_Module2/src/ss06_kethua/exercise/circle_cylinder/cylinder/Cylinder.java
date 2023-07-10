package ss06_kethua.exercise.circle_cylinder.cylinder;

import ss06_kethua.exercise.circle_cylinder.circle.Circle;

public class Cylinder extends Circle {
    private double height = 2;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;


    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "height=" + height + ", " +
                super.toString() + ", " +
                "volume=" + getVolume();
    }
}
