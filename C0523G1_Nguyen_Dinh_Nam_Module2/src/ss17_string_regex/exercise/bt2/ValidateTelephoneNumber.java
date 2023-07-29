package ss17_string_regex.exercise.bt2;

import java.util.Scanner;

public class ValidateTelephoneNumber {
    private static final String REGEX = "\\(\\d{2}\\)[-]\\(0\\d{9}\\)";
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số điện thoại bạn muốn kểm tra: ");
            String telephone = scanner.nextLine();
            if (telephone.matches(REGEX)){
                System.out.println("Số điện thoại đặt đúng quy định.");
            }else {
                System.out.println("Số điện thoại đặt sai quy định.");
            }
        }while (true);

    }
}
