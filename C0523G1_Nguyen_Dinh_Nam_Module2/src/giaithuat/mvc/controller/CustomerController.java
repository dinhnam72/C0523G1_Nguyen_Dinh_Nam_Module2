package giaithuat.mvc.controller;

import giaithuat.mvc.model.Customer;
import giaithuat.mvc.sevice.CustomerServicelmpl;
import giaithuat.mvc.sevice.ICustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    private static ICustomerService service = new CustomerServicelmpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("----- Customer Manager ------");
            System.out.println("1. List");
            System.out.println("2. Create");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("7. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    ArrayList<Customer> customerList = service.findAll();
                    for (int i =0; i<customerList.size();i++) {
                        System.out.println(customerList.get(i));
                    }
                    break;
                case 2:
                    System.out.print("Input Id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input name: ");
                    String name = scanner.nextLine();
                    System.out.print("Input age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input type: ");
                    String typeCustomer = scanner.nextLine();
                    Customer customer = new Customer(id, name, age, typeCustomer);
                    service.addCustomer(customer);
                    break;
                case 3:
                    System.out.print("Input Id: ");
                    int idRemove = Integer.parseInt(scanner.nextLine());
                    service.removeCustomer(idRemove);
                    break;
                case 4:
                    System.out.print("Input name: ");
                    String searchName = scanner.nextLine();
                    service.updateCustomer(searchName);
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}
