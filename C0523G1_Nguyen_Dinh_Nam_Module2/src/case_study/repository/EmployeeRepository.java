package case_study.repository;

import case_study.model.person.Employee;
import case_study.utils.ReadAndWriteFile;
import ss16_binary_file_serialization.exercise.quanlisanpham.util.ReadAndWriterFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String EMPLOYEE_FILE = "D:\\Codegym\\Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\src\\case_study\\data\\employee.csv";

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> strings = ReadAndWriteFile.readFromCSV(EMPLOYEE_FILE);
        String[] array;
        Employee employee;
        for (String string : strings) {
            array = string.split(",");
            String id = array[0];
            String name = array[1];
            LocalDate date = LocalDate.parse(array[2]);
            String gender = array[3];
            String identityCard = array[4];
            String telephone = array[5];
            String email = array[6];
            String education = array[7];
            String location = array[8];
            double wage = Double.parseDouble(array[9]);
            employee = new Employee(id, name, date, gender, identityCard, telephone, email, education, location, wage);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> strings = new ArrayList<>();
        strings.add(employee.getInforToCSV());
        ReadAndWriterFile.writeToCSV(EMPLOYEE_FILE, strings, true);
    }

    @Override
    public void editEmployee(String id, Employee employee) {
        List<Employee> employeeList = getAllEmployee();
        int index = employeeList.indexOf(new Employee(id));
        if (index != -1) {
            employeeList.set(index, employee);
            List<String> stringList = new ArrayList<>();
            for (Employee employee1 : employeeList) {
                stringList.add(employee1.getInforToCSV());
            }
            ReadAndWriterFile.writeToCSV(EMPLOYEE_FILE, stringList, false);
        } else {
            System.out.println("Id không có trong hệ thống. Xin hãy nhập lại");
        }
    }

    @Override
    public void removeEmployee(String id) {
        List<Employee> employeeList = getAllEmployee();
        int index = employeeList.indexOf(new Employee(id));
        if (index != -1) {
            employeeList.remove(index);
            List<String> stringList = new ArrayList<>();
            for (Employee employee1 : employeeList) {
                stringList.add(employee1.getInforToCSV());
            }
            ReadAndWriterFile.writeToCSV(EMPLOYEE_FILE, stringList, false);
        } else {
            System.out.println("Id không có trong hệ thống. Xin hãy nhập lại.");
        }
    }

    @Override
    public List<Employee> searchEmployee(String name) {
        List<Employee> employeeList = this.getAllEmployee();
        List<Employee> searchEmployee = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().contains(name)) {
                searchEmployee.add(employeeList.get(i));
            }
        }
        return searchEmployee;
    }
}
