package Chapter11InheritanceAndPolymorphism;


import java.util.Date;

public class Testprogramperson {
    public static void main(String[] args) {
        Person person=new Person("sumaya mohamed","Hodan","07989048","sumaya493@gmail.com");
        Student student=new Student("Ahmed Abdikarim","Km4","09853032","ahmed45@gmail.com","Senior");
        Date dateHired = new Date(2024, 8, 20);
        Employee employee=new Employee("Abdullahi ali","Banaadir","7890326","abdullahiAli@gmail.com","House:101",25000,dateHired);
        Faculty faculty =new Faculty("Abdinassr Ahmed","Km4","7839205","abdinassrAhmed@gmail.com","House:101",37000,dateHired,12,"Manager");
        Staff staff=new Staff("Muna Ahmed","Hodan","7893204","munaAhmed@gmail.com","House:205",340000,dateHired,"CE0");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
