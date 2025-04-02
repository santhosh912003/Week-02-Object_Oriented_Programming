import java.util.*;

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.println("Enter initial balance: ");
        double balance = sc.nextDouble();

        SavingsAccount savings = new SavingsAccount(accountNumber, accountHolder, balance);

        System.out.println("\nAccount Number: " + savings.accountNumber);
        System.out.println("Account Holder: " + savings.accountHolder);
        System.out.println("Balance: $" + savings.getBalance());

        System.out.println("\nEnter new balance: ");
        double newBalance = sc.nextDouble();
        savings.setBalance(newBalance);

        System.out.println("\nUpdated Balance: $" + savings.getBalance());

        sc.close();
    }
}
class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
}
