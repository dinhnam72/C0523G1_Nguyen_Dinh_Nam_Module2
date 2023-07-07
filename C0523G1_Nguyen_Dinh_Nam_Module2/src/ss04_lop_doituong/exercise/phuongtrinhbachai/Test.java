package ss04_lop_doituong.exercise.phuongtrinhbachai;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Tìm nghiệm của phương trình bậc hai: Ax^2 + Bx + C = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.getResult());
    }
}
