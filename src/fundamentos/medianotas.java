package fundamentos;

import java.util.Scanner;

public class medianotas {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Segunda nota: ");
        nota2 = input.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.2f%n", media);

    }
}