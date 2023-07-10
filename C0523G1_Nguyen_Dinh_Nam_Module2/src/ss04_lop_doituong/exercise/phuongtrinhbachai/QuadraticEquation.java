package ss04_lop_doituong.exercise.phuongtrinhbachai;


public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + Math.pow(getDiscriminant(), 0.5)) / 2;
    }

    public double getRoot2() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / 2;
    }

    public String getResult() {
        if (getDiscriminant() > 0) {
            return "Phương trình có 2 nghiệm " + getRoot1() + " và " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "Phương trình có 1 nghiệm duy nhất " + getRoot1();
        } else {
            return "Phương trình vô nghiệm";
        }
    }
}


