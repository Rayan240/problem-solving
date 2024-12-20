import java.util.Scanner;

class BankAccount {
    private long accountNumber;
    private double balance;

    // Constructor to initialize account number and balance
    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public long getAccountNumber() {
        return accountNumber;
    }
}

public class incapsolation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for account number
        System.out.print("Enter the account number: ");
        long accountNumber = input.nextLong();

        // Initialize account with zero balance
        BankAccount account = new BankAccount(accountNumber, 0);

        // Deposit amount
        System.out.print("Enter the deposit amount: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        // Withdraw amount
        System.out.print("Enter the withdrawal amount: ");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);

        // Display remaining balance
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Remaining Balance: " + account.getBalance());

        input.close();
    }
}
