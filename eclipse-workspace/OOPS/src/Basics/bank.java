package Basics;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String args[]) {
        // Example usage:
        BankAccount bankAccount = new BankAccount(12345, "John Doe");
        bankAccount.deposit(1000.0);
        System.out.println("Current balance: " + bankAccount.getBalance());

        bankAccount.withdraw(500.0);
        System.out.println("Current balance: " + bankAccount.getBalance());

        bankAccount.withdraw(1000.0);
        System.out.println("Current balance: " + bankAccount.getBalance());

    }
}