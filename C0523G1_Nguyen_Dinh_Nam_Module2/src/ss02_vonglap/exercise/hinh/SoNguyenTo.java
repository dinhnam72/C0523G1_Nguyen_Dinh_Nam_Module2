package ss02_vonglap.exercise.hinh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng số nguyên tố cần in ra: ");
        int numbers = sc.nextInt();
        int count = 0;

        for (int i = 2; i < 1000; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
                count++;
            }
            if (count >= numbers) {
                break;
            }
        }

    }
}

