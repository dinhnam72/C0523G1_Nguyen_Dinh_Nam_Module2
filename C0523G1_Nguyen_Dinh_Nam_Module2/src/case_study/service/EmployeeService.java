package case_study.service;

import case_study.model.person.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    static IEmployeeRepository employeeRepository = new EmployeeRepository();
    private static final String REX_ID = "^NV[-]\\d{4}$";
    private static final String REX_NAME = "^[A-Z][a-z]*\\s([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$";
    private static final String REX_IDENTITY_CARD = "^(\\d{4}|\\d)\\d{8}$";
    private static final String REX_GENDER = "^(Nam)|(Nu)$";
    private static final String REX_TELEPHONE = "^0\\d{9}$";
    private static final String REX_EDUCATION = "^(TC)|(CD)|(DH)|(SDH)$";
    private static final String REX_LOCATION = "^(LT)|(PV)|(CV)|(GS)|(QL)|(GD)$";


    @Override
    public void displayEmployee() {
        for (Employee employee : employeeRepository.getAllEmployee()) {
            System.out.println(employee);
        }
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addEmployee() {
        String id;
        do {
            System.out.print("Input idEmployee: ");
            id = scanner.nextLine();
            if (!id.matches(REX_ID)) {
                System.out.println("Id nhập sai quy định(NV-XXXX)!");
            }
        } while (!id.matches(REX_ID));

        String name;
        do {
            System.out.print("Input nameEmployee: ");
            name = scanner.nextLine();
            if (!name.matches(REX_NAME)) {
                System.out.println("Tên bạn nhập sai quy định(Chữ cái đầu in hoa)");
            }
        } while (!name.matches(REX_NAME));

        LocalDate dateOfBirth = null;
        boolean flag = false;
        do {
            try {
                System.out.print("Input dateEmployee: ");
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
            System.out.print("Input genderEmployee: ");
            gender = scanner.nextLine();
            if (!gender.matches(REX_GENDER)) {
                System.out.println("Chỉ được nhập Nam hoặc Nu");
            }
        } while (!gender.matches(REX_GENDER));
        String identityCard;
        do {
            System.out.print("Input identityCardEmployee: ");
            identityCard = scanner.nextLine();
            if (!identityCard.matches(REX_IDENTITY_CARD)) {
                System.out.println("CMND phải đủ 9 hoặc 12 số");
            }
        } while (!identityCard.matches(REX_IDENTITY_CARD));
        String telephone;
        do {
            System.out.print("Input telephoneEmployee: ");
            telephone = scanner.nextLine();
            if (!telephone.matches(REX_TELEPHONE)) {
                System.out.println("Số điện thoại bắt đầu bằng số 0");
            }
        } while (!telephone.matches(REX_TELEPHONE));
        System.out.print("Input email: ");
        String email = scanner.nextLine();
        String education;
        do {
            System.out.print("Input educationEmployee: ");
            education = scanner.nextLine();
            if (!education.matches(REX_EDUCATION)) {
                System.out.println("Trình độ học vấn chưa được nhập đúng");
            }
        } while (!education.matches(REX_EDUCATION));
        String location;
        do {
            System.out.print("Input locationEmployee: ");
            location = scanner.nextLine();
            if (!location.matches(REX_LOCATION)) {
                System.out.println("Nghề nghiệp chưa nhập đúng");
            }
        } while (!location.matches(REX_LOCATION));
        double wage = 0;
        do {
            try {
                System.out.print("Input wageEmployee: ");
                wage = Double.parseDouble(scanner.nextLine());
                if (wage <= 0) {
                    System.out.println("Yêu cầu nhập lương phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Yêu cầu phải nhập số");
                flag = true;
            }
        } while (wage < 0 || flag == false);
        Employee employee = new Employee(id, name, dateOfBirth, gender, identityCard, telephone, email, education, location, wage);
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void editEmployee() {
        String id;
        do {
            System.out.print("Input idEmployee: ");
            id = scanner.nextLine();
            if (!id.matches(REX_ID)) {
                System.out.println("Id nhập sai quy định(NV-XXXX)!");
            }
        } while (!id.matches(REX_ID));

        String name;
        do {
            System.out.print("Input nameEmployee: ");
            name = scanner.nextLine();
            if (!name.matches(REX_NAME)) {
                System.out.println("Tên bạn nhập sai quy định(Chữ cái đầu in hoa)");
            }
        } while (!name.matches(REX_NAME));

        LocalDate dateOfBirth = null;
        boolean flag = false;
        do {
            try {
                System.out.print("Input dateEmployee: ");
                String date = scanner.nextLine();
                dateOfBirth = LocalDate.parse(date);
                LocalDate date1 = dateOfBirth.plusYears(18);
                if (date1.isBefore(LocalDate.now())){
                    flag = true;
                }else {
                    System.out.println("Nhân viên chưa đủ 18 tuổi");
                }

                flag = true;
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu năm tháng ngày (XXXX-YY-ZZ)");
            }
        } while (flag == false);
        String gender;
        do {
            System.out.print("Input genderEmployee: ");
            gender = scanner.nextLine();
            if (!gender.matches(REX_GENDER)) {
                System.out.println("Chỉ được nhập Nam hoặc Nu");
            }
        } while (!gender.matches(REX_GENDER));
        String identityCard;
        do {
            System.out.print("Input identityCardEmployee: ");
            identityCard = scanner.nextLine();
            if (!identityCard.matches(REX_IDENTITY_CARD)) {
                System.out.println("CMND phải đủ 9 hoặc 12 số");
            }
        } while (!identityCard.matches(REX_IDENTITY_CARD));
        String telephone;
        do {
            System.out.print("Input telephoneEmployee: ");
            telephone = scanner.nextLine();
            if (!telephone.matches(REX_TELEPHONE)) {
                System.out.println("Số điện thoại phải 10 số và bắt đầu bằng số 0 (0xxxxxxxxx)");
            }
        } while (!telephone.matches(REX_TELEPHONE));
        System.out.print("Input emailEmployee: ");
        String email = scanner.nextLine();
        String education;
        do {
            System.out.print("Input educationEmployee: ");
            education = scanner.nextLine();
            if (!education.matches(REX_EDUCATION)) {
                System.out.println("Trình độ học vấn chưa được nhập đúng");
            }
        } while (!education.matches(REX_EDUCATION));
        String location;
        do {
            System.out.print("Input locationEmployee: ");
            location = scanner.nextLine();
            if (!location.matches(REX_LOCATION)) {
                System.out.println("Nghề nghiệp chưa nhập đúng");
            }
        } while (!location.matches(REX_LOCATION));
        double wage = 0;
        do {
            try {
                System.out.print("Input wageEmployee: ");
                wage = Double.parseDouble(scanner.nextLine());
                if (wage <= 0) {
                    System.out.println("Yêu cầu nhập lương phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Yêu cầu phải nhập số");
                flag = true;
            }
        } while (wage < 0 || flag == false);
        Employee employee = new Employee(id, name, dateOfBirth, gender, identityCard, telephone, email, education, location, wage);
        employeeRepository.editEmployee(id, employee);

    }

    @Override
    public void removeEmployee() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (!id.matches(REX_ID)) {
                System.out.println("Id nhập sai quy định(NV-XXXX)!");
            }
        } while (!id.matches(REX_ID));
        employeeRepository.removeEmployee(id);
    }

    @Override
    public void searchEmployee() {
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        List<Employee> employeeList = employeeRepository.searchEmployee(name);
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
