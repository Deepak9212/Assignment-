package LabMarch2;

public class customer {
     int accountNumber;
     String accountName;
     double accountBalance;
    
    public customer(int i, String string, double d) {
	
	}

	public void Customer(int accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    
    public void setAmount(double amount) {
        accountBalance += amount;
        System.out.println("Amount added successfully");
    }
    
    public void getAmount() {
        System.out.println("Account name: " + accountName);
        System.out.println("Account balance: " + accountBalance);
    }
    
    public void withDrawAmount(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getAccountName() {
        return accountName;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}

