package Chapter11InheritanceAndPolymorphism;

public class Student extends Person{
    final String freshman="Freshman";
     final String sophomore="Sophomore";
    final String junior="Junior";

    final String  senior="Senior";
    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public String toString() {
        return "Class: Student, Name: " + super.toString();
    }
}
