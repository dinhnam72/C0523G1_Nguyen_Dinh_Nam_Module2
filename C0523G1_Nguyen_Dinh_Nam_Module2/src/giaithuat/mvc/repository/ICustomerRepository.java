package giaithuat.mvc.repository;

import giaithuat.mvc.model.Customer;

import java.util.ArrayList;

public interface ICustomerRepository {
    ArrayList<Customer> findAll();
    void addCustomer(Customer customer);
    void removeCustomer(int idRemove);
    void updateCustomer (String name);
}
