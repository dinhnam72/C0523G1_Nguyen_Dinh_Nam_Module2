package case_study.controller;

import java.util.Scanner;

public class BookingController {
    public static void displayBooking() {
        Scanner scanner = new Scanner(System.in);
        int select4;
        do {
            System.out.println("-----Booking Management-----");
            System.out.println("1. Add new customer");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new booking");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.print("Input number: ");
            select4 = Integer.parseInt(scanner.nextLine());
            switch (select4) {
                case 1:
                    //
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
        }while (true);
    }
}
