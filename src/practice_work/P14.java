package practice_work;

import java.util.Scanner;


// Parent Class
class BankAccount {
    int accountNo;
    String holderName;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        holderName = sc.nextLine();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void display() {
        System.out.println("Account Number : " + accountNo);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }
}

// Child Class – Saving Account
class SavingAccount extends BankAccount {
    double interestRate = 4.0;

    void displaySaving() {
        display();
        System.out.println("Account Type   : Saving Account");
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

// Child Class – Current Account
class CurrentAccount extends BankAccount {
    double interestRate = 0;

    void displayCurrent() {
        display();
        System.out.println("Account Type   : Current Account");
        System.out.println("Interest Rate : " + interestRate);
    }
}


public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            SavingAccount sa = new SavingAccount();
            sa.input();
            System.out.println("\n--- Saving Account Details ---");
            sa.displaySaving();

        } else if (choice == 2) {
            CurrentAccount ca = new CurrentAccount();
            ca.input();
            System.out.println("\n--- Current Account Details ---");
            ca.displayCurrent();

        } else {
            System.out.println("Invalid choice");
        }

    }
}
