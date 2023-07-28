package case_study.controller;

import java.util.Scanner;

public class FacilityController {
    public static void displayFacility() {
        Scanner scanner = new Scanner(System.in);
        int select3;
        do {
            System.out.println("-----Facility Management-----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Delete facility");
            System.out.println("5. Return main menu");
            System.out.print("Input number: ");
            select3 = Integer.parseInt(scanner.nextLine());
            switch (select3) {
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
                    FuramaController.displayMainMenu();
            }
        }while (true);
    }
}
