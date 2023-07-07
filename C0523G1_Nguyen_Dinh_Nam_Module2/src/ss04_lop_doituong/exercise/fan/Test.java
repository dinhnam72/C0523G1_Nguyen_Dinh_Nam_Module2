package ss04_lop_doituong.exercise.fan;

public class Test {
    static Fan fan1 = new Fan(3, true, 10, "yellow");
    static Fan fan2 = new Fan(2, false, 5, "blue");

    public static void main(String[] args) {
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
