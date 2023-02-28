package Abstract;

abstract class BankAccount {
    protected int accountNumber;
    protected double balance;
    
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", new balance is " + balance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", new balance is " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class AssignmentQ {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(123456, 1000.0);
        checkingAccount.deposit(500.0);
        checkingAccount.withdraw(200.0);
    }
}

