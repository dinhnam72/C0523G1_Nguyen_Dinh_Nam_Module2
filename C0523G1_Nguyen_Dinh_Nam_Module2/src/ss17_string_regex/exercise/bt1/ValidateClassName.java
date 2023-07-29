package ss17_string_regex.exercise.bt1;

import java.util.Scanner;

public class ValidateClassName {
    private static final String REGEX_ID = "^[ACP][0-9]{4}[GHIK]$";
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên lớp bạn muốn kểm tra: ");
            String className = scanner.nextLine();
            if (className.matches(REGEX_ID)){
                System.out.println("Tên lớp đặt đúng quy định.");
            }else {
                System.out.println("Tên lớp đặt sai quy định.");
            }
        }while (true);

    }
}
