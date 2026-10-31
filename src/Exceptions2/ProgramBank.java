package Exceptions2;


import Exceptions2.model.entities.Account;
import Exceptions2.model.entities.BexException;

import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdrawal limit: ");
        double withdrawLimit = sc.nextDouble();
        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("New balance: " + account.getBalance());
    } catch (BexException e) {
        System.out.println("Withdraw error: " + e.getMessage());
    }
      catch (RuntimeException e) {
        System.out.println("Unexpected error");
    }




    sc.close();
    }
}
