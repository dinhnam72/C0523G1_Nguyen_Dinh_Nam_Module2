package ss10_stack_queue.exercise.dau_ngoac;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biểu thức cần kiểm tra: ");
        String str = scanner.nextLine();
        KTDauNgoac kiemTra = new KTDauNgoac();
        kiemTra.ktDauNgoac(str);
    }
}
