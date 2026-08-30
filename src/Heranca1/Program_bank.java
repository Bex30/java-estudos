package Heranca1;

import Heranca1.entitites.AccountH;
import Heranca1.entitites.BusinessAccount;
import Heranca1.entitites.SavingsAccount;

public class Program_bank {
    static void main(String[] args) {

        AccountH acc = new AccountH(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0,
                500.0 );

        // UPCASTING

        AccountH acc1 = bacc;
        AccountH acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        AccountH acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

       // BusinessAccount acc5 = (BusinessAccount) acc3;
       if(acc3 instanceof BusinessAccount){
           BusinessAccount acc5 = (BusinessAccount) acc3;
           acc5.loan(200.0);
           IO.println("Loan!");
       }
       if(acc3 instanceof SavingsAccount){
           SavingsAccount acc5 = (SavingsAccount) acc3;
           acc5.updateBalance();
           IO.println("Update!");
       }

       // OVERRIDE

       AccountH acc8 = new AccountH(1001, "Alex", 1000.0);
       acc8.withDraw(200.0);
        IO.println(acc8.getBalance());

        AccountH acc9= new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc9.withDraw(200.0);
        IO.println(acc9.getBalance());

        AccountH acc10 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc10.withDraw(200.0);
        IO.println(acc10.getBalance());

        // POLIMORFISMO (é downcasting e upcasting, eles são tipos de polimorfismo)

        AccountH x = new AccountH(1020, "Alex", 1000.0);
        AccountH y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        x.withDraw(50.0);
        y.withDraw(50.0);

        IO.println(x.getBalance());
        IO.println(y.getBalance());
    }

}
