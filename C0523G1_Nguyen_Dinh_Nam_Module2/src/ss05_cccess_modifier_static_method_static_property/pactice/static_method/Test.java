package ss05_cccess_modifier_static_method_static_property.pactice.static_method;

public class Test {
    public static void main(String args[]) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(1, "A");
        StaticMethod s2 = new StaticMethod(2, "B");
        StaticMethod s3 = new StaticMethod(3, "C");

        s1.display();
        s2.display();
        s3.display();
    }
}
