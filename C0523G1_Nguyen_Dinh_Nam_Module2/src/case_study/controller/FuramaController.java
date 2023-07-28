package case_study.controller;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
//kết nối với service chưa làm nên chưa thể kết nối
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            try {
                System.out.println("-----Management-----");
                System.out.println("1. Employee Management");
                System.out.println("2. Customer Management");
                System.out.println("3. Facility Management");
                System.out.println("4. Booking Management");
                System.out.println("5. Promotion Management");
                System.out.println("6. Exit");
                System.out.print("Input number: ");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        EmployeeController.displayEmployee();
                        break;
                    case 2:
                        CustomerController.displayCustomer();
                        break;
                    case 3:
                        FacilityController.displayFacility();
                        break;
                    case 4:
                        BookingController.displayBooking();
                        break;
                    case 5:
                        PromotionController.displayPromotion();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Yêu cầu nhập từ 0-6");
                }
            }catch (NumberFormatException e){
                System.out.println("Yêu cầu nhập số (0-6)");
            }

        } while (true);
    }
}
