package Lambda;

import Lambda.entities.Product;
import Lambda.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Predicate {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min);
        //List<Double> listt = list.stream().filter(p -> p.getPrice() >= min).toList(); incorreto porque o predicate apenas filtra objetos e não transforma

        for (Product p : list) {
            System.out.println(p);
        }

        //criando função que recebe função predicate
        List<Product> listt = new ArrayList<>();

        listt.add(new Product("Tv", 900.00));
        listt.add(new Product("Mouse", 50.00));
        listt.add(new Product("Tablet", 350.50));
        listt.add(new Product("HD Case", 80.90));
        ProductService ps = new ProductService();

        double sum = ps.filteredSum(listt, p2 -> p2.getName().charAt(0) == 'T');

        System.out.println("Sum = " + sum);
    }
}
