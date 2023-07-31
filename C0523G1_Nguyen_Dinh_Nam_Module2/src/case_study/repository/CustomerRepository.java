package case_study.repository;


import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.utils.ReadAndWriteFile;
import ss16_binary_file_serialization.exercise.quanlisanpham.util.ReadAndWriterFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_FILE = "D:\\Codegym\\Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\src\\case_study\\data\\customer.csv";

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<String> strings = ReadAndWriteFile.readFromCSV(CUSTOMER_FILE);
        String[] array;
        Customer customer;
        for (String string : strings) {
            array = string.split(",");
            String id = array[0];
            String name = array[1];
            LocalDate date = LocalDate.parse(array[2]);
            String gender = array[3];
            String identityCard = array[4];
            String telephone = array[5];
            String email = array[6];
            String customerType = array[7];
            String address = array[8];
            customer = new Customer(id, name, date, gender, identityCard, telephone, email, customerType, address);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> strings = new ArrayList<>();
        strings.add(customer.getInforToCSV());
        ReadAndWriterFile.writeToCSV(CUSTOMER_FILE, strings, true);
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        List<Customer> customerList = getAllCustomer();
        int index = customerList.indexOf(new Customer(id));
        if (index != -1) {
            customerList.set(index, customer);
            List<String> stringList = new ArrayList<>();
            for (Customer customer1 : customerList) {
                stringList.add(customer1.getInforToCSV());
            }
            ReadAndWriterFile.writeToCSV(CUSTOMER_FILE, stringList, false);
        } else {
            System.out.println("Id không có trong hệ thống. Xin hãy nhập lại");
        }
    }

    @Override
    public void removeCustomer(String id) {
        List<Customer> customerList = getAllCustomer();
        int index = customerList.indexOf(new Customer(id));
        if (index != -1) {
            customerList.remove(index);
            List<String> stringList = new ArrayList<>();
            for (Customer customer : customerList) {
                stringList.add(customer.getInforToCSV());
            }
            ReadAndWriterFile.writeToCSV(CUSTOMER_FILE, stringList, false);
        } else {
            System.out.println("Id không có trong hệ thống. Xin hãy nhập lại.");
        }
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        List<Customer> customerList = this.getAllCustomer();
        List<Customer> searchCustomer = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().contains(name)) {
                searchCustomer.add(customerList.get(i));
            }
        }
        return searchCustomer;
    }
}
