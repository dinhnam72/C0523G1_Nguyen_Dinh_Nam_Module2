package ss05_cccess_modifier_static_method_static_property.exercise.access_modifier;

public class Test {
    public static void main(String[] args) {
        Circle accessModifier = new Circle();
        Circle accessModifier1 = new Circle(2);
        System.out.print("radius old: ");
        System.out.println(accessModifier.getRadius());
        System.out.print("area: ");
        System.out.println(accessModifier.getArea());
        System.out.print("radius new: ");
        System.out.println(accessModifier1.getRadius());
        System.out.print("area new: ");
        System.out.println(accessModifier1.getArea());
    }

}
