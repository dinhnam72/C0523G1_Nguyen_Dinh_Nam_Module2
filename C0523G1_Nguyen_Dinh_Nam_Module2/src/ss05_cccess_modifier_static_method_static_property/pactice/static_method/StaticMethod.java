package ss05_cccess_modifier_static_method_static_property.pactice.static_method;

public class StaticMethod {
    private int rollno;
    private String name;
    public static String college = "SMKDK";

    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

