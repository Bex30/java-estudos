package Lambda;

import Lambda.entities.Product;
import Lambda.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Consumer {
    static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        list.forEach(p -> p.setPrice(p.getPrice() * factor));
        //list.forEach(new PriceUpdate());
        //list.forEach(System.out::println);
        //list.forEach(Product::nonStaticPriceUpdate);
        //list.forEach(Product::staticPriceUpdate);
        list.forEach(p -> System.out.println(String.format("%s - $ %.2f", p.getName(), p.getPrice())));
    }
}
