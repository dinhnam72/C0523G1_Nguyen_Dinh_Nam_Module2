package giaithuat.mvc.sevice;

import giaithuat.mvc.model.Customer;
import giaithuat.mvc.repository.CustomerRepositorylmpl;
import giaithuat.mvc.repository.ICustomerRepository;

import java.util.ArrayList;

public class CustomerServicelmpl implements ICustomerService {
    private ICustomerRepository repository = new CustomerRepositorylmpl();

    public ArrayList<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.addCustomer(customer);
    }

    @Override
    public void removeCustomer(int idRemove) {
        repository.removeCustomer(idRemove);
    }

    @Override
    public void updateCustomer(String name) {
        repository.updateCustomer(name);
    }
}
