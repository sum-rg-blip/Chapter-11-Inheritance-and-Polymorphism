package Chapter11InheritanceAndPolymorphism;

import java.util.Date;

public class Employee extends Person{
    String office;
    int salary;
    Date dateHired;
    public Employee(String name, String address, String phoneNumber, String email, String office, int salary, Date dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + super.toString();
    }
}
