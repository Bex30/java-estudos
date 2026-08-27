package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class BancoDepositoSaque {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account bank = new Account();
        double deposit = 0;
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine(); // limpa o Enter pendente

        System.out.println("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)?");
        char yn = sc.next().charAt(0);

        if (yn != 'y' && yn != 'n'){
            do {
                System.out.println("Incorrect response, Is there na initial deposit (y/n)? ");
                yn = sc.next().charAt(0);
            }while (yn != 'y' && yn != 'n');
        }
        if (yn == 'y'){
            System.out.println("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            bank = new Account(number, name, deposit);

        }
        if (yn == 'n'){
            System.out.println("");
            bank = new Account(number, name);
        }



        System.out.println(bank);

        System.out.println("Enter a deposit value: ");
        deposit = sc.nextDouble();

        bank.Deposit(deposit);

        System.out.println(bank);

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bank.WithDraw(withdraw);

        System.out.println(bank);
    }


}
