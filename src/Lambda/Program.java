package Lambda;

import Lambda.entities.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the file you want to read: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Product> products = new ArrayList<>();
            while (line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
           double avg = products.stream().map(p -> p.getPrice())
                   .reduce(0.0, (a, b) -> a + b
                           / products.size());

            System.out.println("Average Price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> listnames = products.stream().filter(x -> x.getPrice() < avg).map(x -> x.getName()).sorted(comp.reversed()).toList();

          listnames.forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
