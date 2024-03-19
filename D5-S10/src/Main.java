class Customer {
    private int accountNo;
    private String accName;
    private int balance;

    public Customer(int accountNo, String accName, int balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
        notify(); // Notify waiting thread (if any) that deposit operation is complete
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Trying to withdraw " + amount);
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait(); // Wait for deposit operation to complete
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(123456789, "John Doe", 10000);

        // Create and start the withdrawal thread
        Thread withdrawalThread = new Thread(() -> {
            customer.withdraw(12000);
        });
        withdrawalThread.start();

        // Create and start the deposit thread
        Thread depositThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some delay before deposit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            customer.deposit(3000);
        });
        depositThread.start();
    }
}
