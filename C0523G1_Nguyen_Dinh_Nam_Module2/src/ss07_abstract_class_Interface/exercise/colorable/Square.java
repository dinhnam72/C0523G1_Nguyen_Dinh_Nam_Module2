package ss07_abstract_class_Interface.exercise.colorable;

public class Square extends Shape implements IColorable {
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
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
