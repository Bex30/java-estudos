package Generics1;

import Generics1.services.PrintService;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many values? ");
        int n = sc.nextInt();
        PrintService<Integer> ps = new PrintService<>();
        for(int i = 0; i < n ; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }
        System.out.println("First: " + ps.first());



    }
}
