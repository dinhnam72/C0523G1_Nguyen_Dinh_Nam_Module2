package giaithuat.mvc.repository;

import giaithuat.mvc.model.Customer;

import java.util.ArrayList;

public class CustomerRepositorylmpl implements ICustomerRepository {
    private static ArrayList<Customer> customersList = new ArrayList<>(10);
    private static int size;

    static {
        Customer customer1 = new Customer(1, "Nhung", 25, "Rich");
        Customer customer2 = new Customer(2, "Nhi", 25, "Ordinary");
        Customer customer3 = new Customer(3, "Tâm", 25, "Poor");
        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);
    }


    @Override
    public ArrayList<Customer> findAll() {
        return customersList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }

    @Override
    public void removeCustomer(int idRemove) {
        for (int i = 0; i < customersList.size(); i++) {
            if (customersList.get(i).getId() == idRemove) {
                customersList.remove(i);
                break;
            }

        }

    }

    @Override
    public void updateCustomer(String name) {
        for (int i = 0; i < customersList.size(); i++) {
            if (customersList.get(i).getName().contains(name)) {
                System.out.println(customersList.get(i));
            }
        }
    }
}
