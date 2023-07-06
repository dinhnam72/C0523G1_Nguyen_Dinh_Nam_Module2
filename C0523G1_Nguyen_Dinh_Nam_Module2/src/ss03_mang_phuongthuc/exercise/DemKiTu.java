package ss03_mang_phuongthuc.exercise;

import java.util.Scanner;

public class DemKiTu {
    public static void main(String[] args) {
        String chuyoiKiTu[] = {"a", "b", "c", "b", "d", "a", "a", "e", "q"};
        System.out.print("Chuỗi ký tự: ");
        for (int i = 0; i < chuyoiKiTu.length; i++) {
            System.out.print(chuyoiKiTu[i] + " ");
        }
        System.out.println();
        System.out.print("Ký tự muốn kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String kiTu = scanner.nextLine();
        int count = 0;
        boolean check = false;
        for (int i = 0; i < chuyoiKiTu.length; i++) {
            if (chuyoiKiTu[i].equals(kiTu)) {
                count++;
                check = true;
                System.out.println("Vị trí xuất hiện " + kiTu + " là " + i);
            }
        }
        if (!check) {
            System.out.println("Kí tự không tồn tại trong chuỗi.");
        } else {
            System.out.println("Ký tự " + kiTu + " xuất hiện " + count + " lần");
        }

    }
}
