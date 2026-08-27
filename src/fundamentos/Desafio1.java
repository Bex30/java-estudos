package fundamentos;

import java.util.Scanner;

public class Desafio1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Nome");
        String name = sc.nextLine();

        System.out.println("Digite sua primeira Nota");
        int n1 = sc.nextInt();

        System.out.println("Digite sua segunda Nota");
        int n2 = sc.nextInt();

        System.out.println("Olá " + name + " Sua Média é: " + (n1 + n2) / 2);
    }
}