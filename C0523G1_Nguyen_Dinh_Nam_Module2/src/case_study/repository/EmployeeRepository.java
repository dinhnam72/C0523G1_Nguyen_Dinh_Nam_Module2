package case_study.repository;

import case_study.model.person.Employee;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private static final String FILE_PATH = "D:\\Codegym\\Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\src\\case_study\\data\\employee.csv";
    private static final String REX_ID ="^NV[-]\\d{4}$";
    private static final String REC_="0\\d{9}";
    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> strings = ReadAndWriteFile.readFromCSV(FILE_PATH);
        String[]array;
        Employee employee;
        for (String string: strings){
            array = string.split(",");
            String id = array[0];
            String name = array[1];
            String date = array[2];
            String gender = array[3];
            String identityCard = array[4];
            String telephone = array[5];
            String email = array[6];
            String education = array[7];
            String location = array[8];
            double wage = Double.parseDouble(array[9]);
            employee = new Employee(id,name,date,gender,identityCard,telephone,email,education,location,wage);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void editEmployee(String id) {

    }

    @Override
    public void removeEmployee(String id) {

    }

    @Override
    public List<Employee> searchEmployee() {
        return null;
    }
}
