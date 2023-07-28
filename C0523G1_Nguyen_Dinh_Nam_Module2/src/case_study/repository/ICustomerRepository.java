package case_study.repository;

import giaithuat.mvc.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    void addCustomer(Customer customer);
    void editCustomer(int id);
    void removeCustomer(int id);
    void searchCustomer(String name);
}
