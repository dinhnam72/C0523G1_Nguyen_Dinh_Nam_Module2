package ss06_kethua.exercise.circle_cylinder.cylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder " + cylinder);
        cylinder = new Cylinder(4.0);
        System.out.println("Cylinder " + cylinder);
        cylinder = new Cylinder(5.0, 3.0, "red");
        System.out.println("Cylinder " + cylinder);
    }


}
