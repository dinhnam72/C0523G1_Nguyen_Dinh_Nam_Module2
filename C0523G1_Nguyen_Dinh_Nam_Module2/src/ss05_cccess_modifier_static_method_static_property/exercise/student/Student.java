package ss05_cccess_modifier_static_method_static_property.exercise.student;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "My name is: " + name + "\nMy class is: " + classes;
    }
}
