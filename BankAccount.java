package IO;

public class BankAccount {


    private int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", new balance is " + balance);
        notify(); // notify waiting thread
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("Balance is insufficient for withdrawal, waiting for deposit...");
            try {
                wait(); // release lock and wait for notification
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + ", new balance is " + balance);
    }
}