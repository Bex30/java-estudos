package Generics_Files;

import Exceptions2.model.entities.BexException;
import Generics_Files.entities.Product;
import Generics_Files.services.CalculationService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        File path = new File("C:\\tmp\\in.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String Line = br.readLine();
            while(Line != null){
                String[] fields = Line.split(",");
                list.add(new Product(Double.parseDouble(fields[1]), fields[0]));
                Line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Most Expensive:");
            System.out.println(x);
        }
        catch (IOException E){
            System.out.println("Error: " + E.getMessage());
        }
    }
}
