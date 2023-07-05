package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int chuyenDoi = 23000;
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tiền USD: ");
        usd = scanner.nextInt();
        int vnd = usd * chuyenDoi;
        System.out.println("Tiền VNĐ: " + vnd);
    }
}
