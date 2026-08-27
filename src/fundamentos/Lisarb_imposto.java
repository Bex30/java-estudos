package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Lisarb_imposto {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double salario, porcent1 = 0.0, porcent2 = 0.0, porcent3 = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você ganha? (em R$)");
        salario = sc.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento");
        }

        if (salario > 3000) {
            System.out.println("Imposto de 8%");
            porcent1 = 1000 * 0.08;
            System.out.printf("Total a ser pago: %.2f%n", porcent1);
        }
        else if (salario > 2000 && salario <= 3000) {
            System.out.println("Imposto de 8%");
            porcent1 = (salario - 2000) * 0.08;
            System.out.printf("Total a ser pago: %.2f%n", porcent1);
        }

        if (salario > 4500) {
            System.out.println("Imposto de 18%");
            porcent2 = 1500 * 0.18;
            System.out.printf("Total a ser pago: %.2f%n", porcent2);
        }
        else if (salario > 3000 && salario <= 4500) {
            System.out.println("Imposto de 18%");
            porcent2 = (salario - 3000) * 0.18;
            System.out.printf("Total a ser pago: %.2f%n", porcent2);
        }

        if (salario > 4500) {
            System.out.println("Imposto de 28%");
            porcent3 = (salario - 4500) * 0.28;
            System.out.printf("Total a ser pago: %.2f%n", porcent3);
        }

        if (salario > 2000) {
            System.out.printf(
                    "O imposto total a ser pago será de %.2f%n",
                    porcent1 + porcent2 + porcent3
            );
        }

    }
}