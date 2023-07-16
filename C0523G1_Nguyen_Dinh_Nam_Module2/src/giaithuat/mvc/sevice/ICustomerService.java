package giaithuat.mvc.sevice;

import giaithuat.mvc.model.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    ArrayList<Customer> findAll();

    void addCustomer(Customer customer);

    void removeCustomer(int idRemove);

    void updateCustomer(String name);
}
