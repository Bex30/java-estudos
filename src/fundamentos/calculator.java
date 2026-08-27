package fundamentos;

import java.util.Scanner;

public class calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um Número: ");
        int n1 = sc.nextInt();

        System.out.println("Escreva outro Número: ");
        int n2 = sc.nextInt();

        System.out.println("Soma = " + (n1 + n2) + " \nSubtração = " + (n1 - n2));
        System.out.println("Multiplicação = " + (n1 * n2) + "\n Divisão = " + (n1 / n2));
    }
}
