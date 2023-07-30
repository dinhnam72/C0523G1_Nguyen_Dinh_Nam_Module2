package case_study.repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAllEmployee();
    void addEmployee(Employee employee);
    void editEmployee(String id, Employee employee);
    void removeEmployee(String id);
    List<Employee> searchEmployee(String name);
}
