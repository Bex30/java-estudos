package Heranca5_Tax;
import Heranca5_Tax.entities.CompanyTax;
import Heranca5_Tax.entities.IndividualTax;
import Heranca5_Tax.entities.TaxPayer;

import java.util.*;
public class Program_Tax {
    static void main() {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        double sum = 0.0;

        IO.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            IO.println("Tax payer #" + i + " data:");
            IO.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            IO.print("Name: ");
            String name = sc.next();
            IO.print("Anual income: ");
            double income = sc.nextDouble();
            if(ch == 'i'){
                IO.print("Health expenditures: ");
                double exp = sc.nextDouble();
                list.add(new IndividualTax(name, income, exp));
            }
            else{
                IO.print("Number of employees: ");
                int emp = sc.nextInt();
                list.add(new CompanyTax(name, income, emp));
            }
        }

        IO.println("TAXES PAID:");
        for(TaxPayer p : list){
            System.out.printf("%s: $ %.2f\n",p.getName(), p.TaxPay());
        }
        for(TaxPayer p : list){
            sum += p.TaxPay();
        }
        IO.println("TOTAL TAXES: $ " + sum);

    }
}
