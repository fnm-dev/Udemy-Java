package application;

import entities.BankAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n) ");
        char response = sc.next().charAt(0);

        if(response =='y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new BankAccount(accountNumber, accountHolder, initialDeposit);
        }else {
            acc = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println("\nAccount data:");
        System.out.print(acc);

        System.out.print("\n\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        acc.deposit(depositValue);
        updateData(acc);

        System.out.print("\n\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        acc.withdraw(withdrawValue);
        updateData(acc);

        sc.close();
    }

    public static void updateData(BankAccount acc){
        System.out.println("Updated account data:");
        System.out.print(acc);
    }
}
