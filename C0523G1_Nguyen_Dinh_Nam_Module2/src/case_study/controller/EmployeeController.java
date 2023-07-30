package case_study.controller;

import case_study.service.EmployeeService;
import case_study.service.IEmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public static void displayEmployee(){
        IEmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        int select1;
        do {
            System.out.println("-----Employee Management-----");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search by name employee");
            System.out.println("6. Return main menu");
            System.out.print("Input number: ");
            select1 = Integer.parseInt(scanner.nextLine());
            switch (select1) {
                case 1:
                    employeeService.displayEmployee();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    employeeService.removeEmployee();
                    break;
                case 5:
                    employeeService.searchEmployee();
                    break;
                case 6:
                    FuramaController.displayMainMenu();
            }
        }while (true);
    }


}

