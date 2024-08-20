package Chapter11InheritanceAndPolymorphism;


import java.util.Date;

public class Faculty extends Employee{
    double OfficeHours;
    String rank;
    public Faculty(String name, String address, String phoneNumber, String email, String office, int salary, Date dateHired, double officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.OfficeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + super.toString();
    }
}
