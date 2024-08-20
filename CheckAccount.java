package Chapter11InheritanceAndPolymorphism;

import java.util.Date;

public class CheckAccount extends TheAccount{
    private double overdraftLimit;

    public CheckAccount(int accountNumber, int balance, double annualInterestRate, double overdraftLimit, Date dateCreated ) {
        super(accountNumber, balance, annualInterestRate,dateCreated);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double Amount) {
        if (Amount > 0 && (getBalance() + overdraftLimit) >= Amount) {
            super.withdraw(Amount);
        } else {
            System.out.println("Overdraft limit exceeded. Cannot withdraw.");
        }
    }

    @Override
    public String toString() {
        return "Checking " + super.toString() + "\nOverdraft Limit: " + overdraftLimit;
    }
}
