package fundamentos;

import java.util.Scanner;

public class impar_par {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Ímpar");
        }

    }
}