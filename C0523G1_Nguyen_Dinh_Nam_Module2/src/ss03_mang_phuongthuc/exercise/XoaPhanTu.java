package ss03_mang_phuongthuc.exercise;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int value[] = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.print("Phần tử trước khi xóa: ");
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn xóa: ");
        int soCanXoa = scanner.nextInt();
        boolean flag = true;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == soCanXoa) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("Số này không có trong mảng");
        }
        int newValue[] = new int[10];
        for (int i = 0; i < value.length; i++) {
            if (soCanXoa == value[i]) {
                if (i == value.length - 1) {
                    newValue[i] = 0;
                } else {
                    newValue[i] = value[i + 1];
                }
            } else {
                newValue[i] = value[i];
            }
        }
        System.out.print("Phần tử sau khi xóa: ");
        for (int i = 0; i < newValue.length; i++) {
            System.out.print(newValue[i] + " ");
        }
    }
}
