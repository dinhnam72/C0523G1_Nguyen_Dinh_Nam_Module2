package case_study.controller;

import case_study.service.FacilityService;
import case_study.service.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    public static void displayFacility() {
        IFacilityService facilityService = new FacilityService();
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
                    facilityService.displayFacility();
                    break;
                case 2:
                    System.out.println("---Add Facility---");
                    System.out.println("1. Add New Villa");
                    System.out.println("2. Add New House");
                    System.out.println("3. Add New Room");
                    System.out.println("4. Back to menu");
                    int select;
                    do {
                        System.out.print("input number: ");
                        select = Integer.parseInt(scanner.nextLine());
                        switch (select) {
                            case 1:
                                facilityService.addFacilityVilla();
                                break;
                            case 2:
                                facilityService.addFacilityHouse();
                                break;
                            case 3:
                                facilityService.addFacilityRoom();
                                break;
                            case 4:
                                FacilityController.displayFacility();
                        }
                    } while (true);

                case 3:
                    facilityService.displayFacilityMaintenance();
                    break;
                case 4:
                    facilityService.removeFacility();
                    break;
                case 5:
                    FuramaController.displayMainMenu();
            }
        } while (true);
    }
}
