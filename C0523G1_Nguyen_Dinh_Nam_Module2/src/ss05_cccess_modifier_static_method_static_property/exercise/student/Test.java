package ss05_cccess_modifier_static_method_static_property.exercise.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Nam");
        student.setClasses("C0523G1");
        System.out.println(student);
    }
}
