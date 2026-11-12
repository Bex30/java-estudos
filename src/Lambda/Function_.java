package Lambda;

import Lambda.entities.Product;
import Lambda.services.ProductService;
import Lambda.util.UpperCaseName;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Function_ {
    static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Function<Product, String> func = p -> p.getName().toUpperCase();

                                              //.map(func)
       List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); // ou apenas .toList a partir do jdk 17

       names.forEach(System.out::println);


    }
}
