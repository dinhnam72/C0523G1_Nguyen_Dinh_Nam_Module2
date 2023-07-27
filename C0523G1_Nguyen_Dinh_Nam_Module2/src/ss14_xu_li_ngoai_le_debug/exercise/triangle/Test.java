package s14_xu_li_ngoai_le_debug.exercise.triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.print("Nhập chiều dài cạnh a: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập chiều dài cạnh b: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập chiều dài cạnh c: ");
                double c = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(a,b,c);
                System.out.println(triangle);
                flag = false;
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Bạn phải nhập số.");
            }
        }while (flag);

    }
}
