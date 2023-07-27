package s14_xu_li_ngoai_le_debug.exercise.triangle;

public class Triangle {
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác phải lớn hơn 0.");
        } else if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại!");

        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
