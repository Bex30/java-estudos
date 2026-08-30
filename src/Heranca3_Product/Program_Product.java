package Heranca3_Product;

import Heranca2_Employee.entities.EmployeeH;
import Heranca3_Product.entities.ImportedProducts;
import Heranca3_Product.entities.Product;
import Heranca3_Product.entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_Product {
    static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        char ch = '´';
        List<Product> list = new ArrayList<>();




        IO.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            IO.println("Product #" + i + " data:");
            do {
                IO.print("Common, used or imported (c/u/i)? ");
                 ch = sc.next().charAt(0);
            }while(ch != 'c' && ch != 'u' && ch != 'i');
            IO.print("Name: ");
            String name = sc.nextLine();
            IO.print("Price: ");
            Double price = sc.nextDouble();
            if (ch == 'i') {
                IO.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProducts(name, price, customsFee));
            }
            if (ch == 'c') {
                list.add(new Product(name, price));
            }
            if (ch == 'u') {
                IO.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufacture = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, manufacture));
            }
        }

        IO.print("PRICE TAGS:");
       for(Product p : list){
           IO.print(p.priceTag());
       }

    }
}
