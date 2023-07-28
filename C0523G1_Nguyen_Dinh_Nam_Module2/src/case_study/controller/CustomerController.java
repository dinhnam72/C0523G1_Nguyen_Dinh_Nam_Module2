package case_study.controller;

import java.util.Scanner;

public class CustomerController {
    public static void displayCustomer() {
        Scanner scanner = new Scanner(System.in);
        int select2;
        do {
            System.out.println("-----Customer Management-----");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search by name customer");
            System.out.println("6. Return main menu");
            System.out.print("Input number: ");
            select2 = Integer.parseInt(scanner.nextLine());
            switch (select2) {
                case 1:
                    System.out.println("avgh");
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
                case 6:
                    FuramaController.displayMainMenu();
            }

        } while (true) ;
    }
}
