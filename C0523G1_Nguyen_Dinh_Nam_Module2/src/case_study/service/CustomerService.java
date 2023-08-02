package case_study.service;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomerRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    public static ICustomerRepository customerRepository = new CustomerRepository();
    private static final String REX_ID = "^KH[-]\\d{4}$";
    private static final String REX_NAME = "^[A-Z][a-z]*\\s([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$";
    private static final String REX_IDENTITY_CARD = "^(\\d{4}|\\d)\\d{8}$";
    private static final String REX_GENDER = "^(Nam)|(Nu)$";
    private static final String REX_TELEPHONE = "^0\\d{9}$";
    private static final String REX_TYPE = "^D|P|G|S|M$";

    @Override
    public void displayCustomer() {
        for (Customer customer : customerRepository.getAllCustomer()) {
            System.out.println(customer);
        }
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addCustomer() {
        String id;
        do {
            System.out.print("Input idCustomer: ");
            id = scanner.nextLine();
            if (!id.matches(REX_ID)) {
                System.out.println("Id nhập sai quy định(NV-YYYY)!");
            }
        } while (!id.matches(REX_ID));

        String name;
        do {
            System.out.print("Input nameCustomer: ");
            name = scanner.nextLine();
            if (!name.matches(REX_NAME)) {
                System.out.println("Tên bạn nhập sai quy định(Chữ cái đầu in hoa)");
            }
        } while (!name.matches(REX_NAME));

        LocalDate dateOfBirth = null;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.print("Input dateCustomer: ");
                String date = scanner.nextLine();
                dateOfBirth = LocalDate.parse(date);
                LocalDate date1 = dateOfBirth.plusYears(18);
                if (date1.isBefore(LocalDate.now())) {
                    flag = true;
                } else {
                    System.out.println("Nhân viên chưa đủ 18 tuổi");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu năm tháng ngày (XXXX-YY-ZZ)");
            }
        } while (flag == false);
        String gender;
        do {
            System.out.print("Input genderCustomer: ");
            gender = scanner.nextLine();
            if (!gender.matches(REX_GENDER)) {
                System.out.println("Chỉ được nhập Nam hoặc Nu");
            }
        } while (!gender.matches(REX_GENDER));
        String identityCard;
        do {
            System.out.print("Input identityCardCustomer: ");
            identityCard = scanner.nextLine();
            if (!identityCard.matches(REX_IDENTITY_CARD)) {
                System.out.println("CMND phải đủ 9 hoặc 12 số");
            }
        } while (!identityCard.matches(REX_IDENTITY_CARD));
        String telephone;
        do {
            System.out.print("Input telephoneCustomer: ");
            telephone = scanner.nextLine();
            if (!telephone.matches(REX_TELEPHONE)) {
                System.out.println("Số điện thoại gồm 10 số và bắt đầu bằng số 0 (0xxxxxxxxx)");
            }
        } while (!telephone.matches(REX_TELEPHONE));
        System.out.print("Input emailCustomer: ");
        String email = scanner.nextLine();
        String customerType;
        do {
            System.out.print("Input customerType: ");
            customerType = scanner.nextLine();
            if (!customerType.matches(REX_TYPE)) {
                System.out.println("Loại khách hàng chưa được nhập đúng");
            }
        } while (!customerType.matches(REX_TYPE));

        System.out.print("Input addressCustomer: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, dateOfBirth, gender, identityCard, telephone, email, customerType, address);
        customerRepository.addCustomer(customer);
    }

    @Override
    public void editCustomer() {
        String id;
        do {
            System.out.print("Input idCustomer: ");
            id = scanner.nextLine();
            if (!id.matches(REX_ID)) {
                System.out.println("Id nhập sai quy định(NV-XXXX)!");
            }
        } while (!id.matches(REX_ID));

        String name;
        do {
            System.out.print("Input nameCustomer: ");
            name = scanner.nextLine();
            if (!name.matches(REX_NAME)) {
                System.out.println("Tên bạn nhập sai quy định(Chữ cái đầu in hoa)");
            }
        } while (!name.matches(REX_NAME));

        LocalDate dateOfBirth = null;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.print("Input dateCustomer: ");
                String date = scanner.nextLine();
                dateOfBirth = LocalDate.parse(date);
                LocalDate date1 = dateOfBirth.plusYears(18);
                if (date1.isBefore(LocalDate.now())) {
                    flag = true;
                } else {
                    System.out.println("Nhân viên chưa đủ 18 tuổi");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu năm tháng ngày (XXXX-YY-ZZ)");
            }
        } while (flag == false);
        String gender;
        do {
            System.out.print("Input genderCustomer: ");
            gender = scanner.nextLine();
            if (!gender.matches(REX_GENDER)) {
                System.out.println("Chỉ được nhập Nam hoặc Nu");
            }
        } while (!gender.matches(REX_GENDER));
        String identityCard;
        do {
            System.out.print("Input identityCardCustomer: ");
            identityCard = scanner.nextLine();
            if (!identityCard.matches(REX_IDENTITY_CARD)) {
                System.out.println("CMND phải đủ 9 hoặc 12 số");
            }
        } while (!identityCard.matches(REX_IDENTITY_CARD));
        String telephone;
        do {
            System.out.print("Input telephoneCustomer: ");
            telephone = scanner.nextLine();
            if (!telephone.matches(REX_TELEPHONE)) {
                System.out.println("Số điện thoại gồm 10 số và bắt đầu bằng số 0 (0xxxxxxxxx)");
            }
        } while (!telephone.matches(REX_TELEPHONE));
        System.out.print("Input emailCustomer: ");
        String email = scanner.nextLine();
        String customerType;
        do {
            System.out.print("Input customerType: ");
            customerType = scanner.nextLine();
            if (!customerType.matches(REX_TYPE)) {
                System.out.println("Loại khách hàng chưa được nhập đúng");
            }
        } while (!customerType.matches(REX_TYPE));

        System.out.print("Input addressCustomer: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, identityCard, telephone, email, customerType, address);
        customerRepository.editCustomer(id, customer);
    }

    @Override
    public void removeCustomer() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (!id.matches(REX_ID)) {
                System.out.println("Id nhập sai quy định(NV-XXXX)!");
            }
        } while (!id.matches(REX_ID));
        customerRepository.removeCustomer(id);
    }

    @Override
    public void searchCustomer() {
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        List<Customer> customerList = customerRepository.searchCustomer(name);
        for (Customer e : customerList) {
            System.out.println(e);
        }
    }
}
