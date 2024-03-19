import java.util.Scanner;
class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String depositorName, String accountNumber, String accountType, double balance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance - amount < 500) {
            System.out.println("Insufficient balance! Minimum balance must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "1234567890", "Savings", 10000);

        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: Rs. ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
