package ss05_cccess_modifier_static_method_static_property.exercise.access_modifier;

public class AccessModifier {
    private double radius = 1.0;
    private String color ="red";
    public AccessModifier(){

    }

    public AccessModifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }
}
