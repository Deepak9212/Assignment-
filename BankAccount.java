package Interface;

interface BankAccounts {
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount implements BankAccounts {
    private double balance;

    public CheckingAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class BankAccount {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1000.0);
        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}

