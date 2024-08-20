package Chapter11InheritanceAndPolymorphism;

public class Person {
    String name;
    String address;
    String phoneNumber;
    String EmailAddress;
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.EmailAddress = email;
    }

    public String toString() {
        return "Class: Person, Name: " + name;
    }
}
