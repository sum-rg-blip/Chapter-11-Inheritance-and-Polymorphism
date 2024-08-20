package Chapter11InheritanceAndPolymorphism;

import java.util.Date;

public class TheAccount {
    int accountNumber;
    int balance;

    double annualInterestRate;

    Date dateCreated;
    public TheAccount(int accountNumber, int balance, double annualInterestRate, Date dateCreated){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.annualInterestRate =annualInterestRate;
        this.dateCreated =new Date();
    }

    public void Deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double Amount){
        if (Amount > 0 && balance >= Amount) {
            balance -= Amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthlyInterestRate(){
        return  annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }
    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: " + balance +
                "\nAnnual Interest Rate: " + annualInterestRate +
                "\nDate Created: " + dateCreated;
    }

}
