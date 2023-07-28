package case_study.service;

import case_study.model.person.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService{
    static IEmployeeRepository employeeRepository =new EmployeeRepository();
    @Override
    public void displayEmployee() {
        for (Employee employee: employeeRepository.getAllEmployee()){
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {

    }

    @Override
    public void editEmployee() {

    }

    @Override
    public void removeEmployee() {

    }

    @Override
    public void searchEmployee() {

    }
}
