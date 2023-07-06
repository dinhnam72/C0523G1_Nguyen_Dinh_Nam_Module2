package ss03_mang_phuongthuc.exercise;

import java.util.Scanner;

public class TongPhanTuCot {
    public static void main(String[] args) {
        double arr[][] = {{56.2, 5.9, 6, 3.5}, {3.8, 2, 8.7}, {2.7, 14.5, 20.4, 46.3, 3.9}};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử dòng " + (i + 1) + " : ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Vị trí cột muốn tính tổng: ");
        Scanner scanner = new Scanner(System.in);
        int viTriCot = scanner.nextInt();
        if (viTriCot < 0 || viTriCot > 4) {
            System.out.println("Vị trí bạn nhập không nằm trong mảng. Xin hãy nhập lại.");
        }else {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j <= arr[i].length; j++) {
                    if ((viTriCot) == j) {
                        sum += arr[i][viTriCot];
                    }
                }
            }
            System.out.print("Tổng các giá trị trong cột " + viTriCot + " : " + sum);
        }
    }
}
