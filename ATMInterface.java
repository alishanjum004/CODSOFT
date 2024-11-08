import java.util.*;
import java.io.*;
class BankAccount {
    private double Balance;

    public BankAccount(double initialBalance) {
        this.Balance = initialBalance;
    }

    public double getBalance() {
        return Balance;
    }
    public boolean withdraw(double Amount) {
        if (Amount > 0 && Amount <= Balance) {
            Balance -= Amount;
            System.out.println("Withdrawal successfully completed.");
            System.out.println("Remaining balance : "+Balance);
            return true;
        } else if (Amount > Balance) {
            System.out.println("Insufficient balance.");
            System.out.println("Please try later");
            return false;
        } else {
            System.out.println("Invalid withdrawal amount.");
            System.out.println("Please try later");
            return false;
        }
    }
    public void deposit(double Amount) {
        if (Amount > 0) {
            Balance += Amount;
            System.out.println("Deposit successful.");
            System.out.println("Balance is : "+Balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("You have withdrawn $" + amount);
        }
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("You have deposited $" + amount);
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 4);
    }
}
public class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0); 
        ATM atm = new ATM(account);
        atm.Menu();
    }
}

