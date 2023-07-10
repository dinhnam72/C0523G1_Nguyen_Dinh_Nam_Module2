package ss06_kethua.exercise.circle_cylinder.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getDarius() {
        return radius;
    }

    public void setDarius(double darius) {
        this.radius = darius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.round((radius * radius * Math.PI)*100.0)/100.0;
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", color=" + color +
                ", area=" + getArea();
    }
}


