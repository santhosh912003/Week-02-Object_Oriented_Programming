import java.util.Scanner;

public class SimulateAnATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the accountHolder: ");
        String name = sc.nextLine();

        System.out.println("Enter his/her accountNumber: ");
        int acc_no = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the initial balance amount: ");
        int balance = sc.nextInt();
        sc.nextLine();

        BankAccount obj = new BankAccount(name, acc_no, balance);
        obj.display();

        System.out.println("\nEnter the amount you want to deposit: ");
        int d = sc.nextInt();
        obj.deposit(d);
        obj.display();

        System.out.println("\nEnter the amount you want to withdraw: ");
        int w = sc.nextInt();
        obj.withdraw(w);
        obj.display();

        sc.close();
    }
}

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(int money) {
        this.balance += money;
        System.out.println("Successfully deposited " + money);
    }

    void withdraw(int money) {
        if (money > this.balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
            return;
        }
        this.balance -= money;
        System.out.println("Successfully withdrew " + money);
    }

    void display() {
        System.out.printf("Account Holder: %s, Account Number: %d, Current Balance: %d%n",
                this.accountHolder, this.accountNumber, this.balance);
    }
}
