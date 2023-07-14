package ss07_abstract_class_Interface.exercise.shape;

public class Test {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(5);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            shapes[i].resizeable(Math.random());
            System.out.println(shapes[i]);

        }

    }
}
