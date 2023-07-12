package ss07_abstract_class_Interface.exercise.shape;

public class Square extends Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void resizeable(double percent) {
        setSide(side + side * percent);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + getArea() +
                '}';
    }
}
