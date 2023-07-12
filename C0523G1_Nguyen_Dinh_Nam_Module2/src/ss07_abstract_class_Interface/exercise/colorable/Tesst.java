package ss07_abstract_class_Interface.exercise.colorable;

public class Tesst {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(5);
        for (Shape shape:shapes) {
            if (shape instanceof Square){ //shape có kiểu DL là Square ko
                ((Square)shape).howToColor();//lấy phần tử shape có kiểu Square gọi method
            }
            System.out.println(shape);
        }
    }
}
