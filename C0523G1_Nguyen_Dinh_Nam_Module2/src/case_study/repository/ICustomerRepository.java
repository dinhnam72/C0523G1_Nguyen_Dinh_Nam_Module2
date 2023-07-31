package case_study.repository;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAllCustomer();
    void addCustomer(Customer customer);
    void editCustomer(String id,Customer customer);
    void removeCustomer(String id);
    List<Customer> searchCustomer(String name);
}
