package ss03_mang_phuongthuc.exercise;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước: ");
            size = scanner.nextInt();
            if (size < 0) {
                System.out.println("Kích thước mảng phải lớn hơn 0.");
            }
        } while (size < 0);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Phần tử trước khi thêm: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Nhập số bạn muốn thêm: ");
        int soCanThem = scanner.nextInt();
        System.out.print("Nhập vị trí bạn muốn thêm: ");
        int inder = scanner.nextInt();
        if (inder < 0 || inder > array.length) {
            System.out.println("Vị trí này nằm ngoài mảng.");
        }
        int newArray[] = new int[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (inder > i) {
                newArray[i] = array[i];
            } else if (inder == i) {
                newArray[i] = soCanThem;
            } else {
                newArray[i] = array[i-1];
            }
        }
        System.out.print("Phần tử sau khi thêm:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");

        }
    }
}
