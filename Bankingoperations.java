package LabMarch2;


public class Bankingoperations {
    public static void main(String[] args) {
        customer customer1 = new customer(123, "Deepak", 1000.0);
        customer customer2 = new customer(456, "Sonu", 2000.0);
        
        // Adding amount to customer 1 account
        customer1.setAmount(500.0);
        
        // Displaying customer 1 account balance and name
        customer1.getAmount();
        
        // Withdrawing amount from customer 2 account
        customer2.withDrawAmount(1000.0);
        
        // Displaying customer 2 account balance and name
        customer2.getAmount();
    }
}



