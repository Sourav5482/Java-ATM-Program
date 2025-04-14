import java.util.*;

public class Main {
    static int balance = 1000;
    static Scanner sc = new Scanner(System.in); // Reusable Scanner

    // For menu
    static int menu() {
        System.out.println("\n====== ATM Menu ======");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    // For deposit
    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // For withdraw
    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    // For checking balance
    static void check() {
        System.out.println("Current Balance: " + balance);
    }

    // Main
    public static void main(String[] args) {
        while (true) {
            int ch = menu();
            switch (ch) {
                case 1:
                    check();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
        