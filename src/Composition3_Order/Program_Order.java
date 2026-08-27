package Composition3_Order;

import Composition3_Order.entities.Client;
import Composition3_Order.entities.Order;
import Composition3_Order.entities.OrderItem;
import Composition3_Order.entities.Product;
import Composition3_Order.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program_Order {
    static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter cliente data:");
        IO.print("Name: ");
        String name = sc.nextLine();
        IO.print("Email: ");
        String email = sc.nextLine();
        IO.print("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf.parse(sc.next());
        Client cliente = new Client(name, email,birthDate);
        IO.println("Enter order data:");
        IO.print("Status:");
        sc.nextLine();
        String Status = sc.nextLine();
        Order order =  new Order(cliente, new Date(), OrderStatus.valueOf(Status));
        IO.print("How many items to this order? ");
        int many = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < many; i++){
            IO.println("Enter #"+ (i + 1) +" item data:");
            IO.print("Product name:");
            String productname = sc.nextLine();
            IO.print("Product price: ");
            Double price = sc.nextDouble();
            IO.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();
            Product produto = new Product(productname, price);
            OrderItem item = new OrderItem(quantity, price, produto);
            order.addItem(item);
        }

        IO.println("ORDER SUMMARY: ");
        IO.println("Order moment: " + sdf2.format(order.getMoment()));
        IO.println("Order status: " + order.getStatus());
        IO.println("Client: " + cliente.getName() +
                " (" + sdf.format(cliente.getBirthDate()) + ") -"
                + cliente.getEmail());
        IO.println("Order items:");
        for (OrderItem items : order.getItems()){
            IO.println(
                    items.getProduct().getName()
                            + ", $"
                            + items.getPrice()
                            + ", Quantity: "
                            + items.getQuantity()
                            + ", Subtotal: $"
                            + items.subTotal()
            );

        }
        IO.print("Total price: " + order.total());


    }
}
