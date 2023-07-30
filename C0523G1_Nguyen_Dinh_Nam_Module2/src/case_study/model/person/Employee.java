package case_study.model.person;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {
    private String education;
    private String location;
    private double wage;

    public Employee() {
    }
    public Employee(String id){
        super(id);
    }

    public Employee(String education, String location, double wage) {
        this.education = education;
        this.location = location;
        this.wage = wage;
    }

    public Employee(String id, String name, LocalDate date, String gender, String identityCard, String telephone, String email, String education, String location, double wage) {
        super(id, name, date, gender, identityCard, telephone, email);
        this.education = education;
        this.location = location;
        this.wage = wage;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getInforToCSV() {
        return this.getId() + "," + this.getName() + "," + this.getDate() + "," + this.getGender() + "," + this.getIdentityCard() + "," + this.getTelephone() + "," + this.getEmail() + "," + this.getEducation() + "," + this.getLocation() + "," + this.getWage();
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "education='" + education + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(super.getId(),employee.getId());
    }

}
