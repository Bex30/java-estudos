package application;

import entities.CurrencyConventer;

import java.util.Locale;
import java.util.Scanner;

public class Conversao {

        static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual dólar price");
            double price = sc.nextDouble();
            System.out.println("Quantos dinero");
            double dinero = sc.nextDouble();

            double result = CurrencyConventer.converter(price,dinero);
            System.out.printf("Amount to be paid in reais = %.2f%n", result);

            sc.close();
        }
    }


