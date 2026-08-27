package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Program_Order {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
     //   String eita = sc.nextLine();
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
     //   OrderStatus os3 = OrderStatus.valueOf(eita);

        System.out.println(os1);
        System.out.println(os2);
      //  System.out.println(os3);
    }

}
