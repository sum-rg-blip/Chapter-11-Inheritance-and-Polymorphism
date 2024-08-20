package Chapter11InheritanceAndPolymorphism;
import java.util.Date;


public class SavingsAccount extends TheAccount {

    public SavingsAccount(int accountNumber, int balance, double annualInterestRate,Date datecreated) {
        super(accountNumber, balance, annualInterestRate,datecreated);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance. Cannot withdraw.");
        }
    }

    @Override
    public String toString() {
        return "Savings " + super.toString();
    }
}

