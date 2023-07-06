package ss03_mang_phuongthuc.exercise;

import java.util.Scanner;

public class PhanTuNhoNhat {
    public static void main(String[] args) {
        System.out.print("Nhập độ lớn của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng: " + min);
    }
}
