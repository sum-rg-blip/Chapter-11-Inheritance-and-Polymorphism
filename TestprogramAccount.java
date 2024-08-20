package Chapter11InheritanceAndPolymorphism;

import java.util.Date;

public class TestprogramAccount {
    public static void main(String[] args) {
        Date dateHired = new Date(2024, 5, 20);
        TheAccount account = new TheAccount(101, 5000, 3.5,dateHired);
        SavingsAccount savings = new SavingsAccount(102, 3000, 4.0,dateHired);
        CheckAccount checking = new CheckAccount(103, 2000, 3.0, 500,dateHired);

        System.out.println(account);
        System.out.println(savings);
        System.out.println(checking);
    }
}
