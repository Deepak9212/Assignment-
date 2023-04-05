package IO;



public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                account.withdraw(500);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                account.deposit(1000);
            }
        });

        t1.start();
        t2.start();
    }
}


