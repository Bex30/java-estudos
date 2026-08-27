package application;
import entities.Products;
import java.util.Locale;
import java.util.Scanner;

public class Program_loja {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Products bill;
        Products p = new Products();
        System.out.println("Enter the product name");
        String Name = sc.nextLine();

        System.out.println("Enter the product price");
        double Price = sc.nextDouble();

        /* TESTE DE GET E SET
        p.setPrice(1200);
        System.out.println(p.getPrice());
        System.out.println(p.getQuantity());
        */

        bill = new Products(Name, Price);
        System.out.println();
        System.out.println("Product Data: "+ bill);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock:\n");
        int Quantity = sc.nextInt();
        bill.AddProducts(Quantity);

        System.out.println();
        System.out.println("Updated Data: "+ bill);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock:\n");
        Quantity = sc.nextInt();
        bill.RemoveProducts(Quantity);

        System.out.println("Updated Data: "+ bill);
    }
}
