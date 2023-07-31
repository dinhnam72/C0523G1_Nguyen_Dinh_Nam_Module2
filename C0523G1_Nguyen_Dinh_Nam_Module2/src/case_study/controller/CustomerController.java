package case_study.controller;

import case_study.service.CustomerService;
import case_study.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    public static void displayCustomer() {
        ICustomerService customerService = new CustomerService();
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
                    customerService.displayCustomer();
                    break;
                case 2:
                    customerService.addCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    customerService.removeCustomer();
                    break;
                case 5:
                    customerService.searchCustomer();
                    break;
                case 6:
                    FuramaController.displayMainMenu();
            }

        } while (true) ;
    }
}
