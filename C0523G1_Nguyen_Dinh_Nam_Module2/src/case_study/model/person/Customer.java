package case_study.model.person;

import java.time.LocalDate;
import java.util.Objects;

public class Customer extends Person {
    private String customerType;
    private String address;
    public Customer() {
    }
    public Customer(String id){
        super(id);
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, LocalDate date, String gender, String identityCard, String telephone, String email, String customerType, String address) {
        super(id, name, date, gender, identityCard, telephone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getInforToCSV() {
        return this.getId() + "," + this.getName() + "," + this.getDate() + "," + this.getGender() + "," + this.getIdentityCard() + "," + this.getTelephone() + "," + this.getEmail() + "," + this.getCustomerType() + "," + this.getAddress() ;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Customer customer =(Customer) o;
        return Objects.equals(super.getId(),customer.getId());
    }

}
