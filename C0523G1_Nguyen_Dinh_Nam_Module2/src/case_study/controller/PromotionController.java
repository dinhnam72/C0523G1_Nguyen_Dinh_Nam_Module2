package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    public static void displayPromotion() {
        Scanner scanner = new Scanner(System.in);
        int select5;
        do {
            System.out.println("-----Promotion Management-----");
            System.out.println("1. Display list customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            System.out.print("Input number: ");
            select5 = Integer.parseInt(scanner.nextLine());
            switch (select5) {
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    FuramaController.displayMainMenu();
            }
        } while (true);
    }
}
