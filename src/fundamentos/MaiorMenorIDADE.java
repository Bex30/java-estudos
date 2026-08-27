package fundamentos;

import java.util.Scanner;

public class MaiorMenorIDADE {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua ídade? ");
        int age = sc.nextInt();

        if (age < 18){
            System.out.println("Menor de Idade");
        }
        else {
            System.out.println("Maior de Ídade");
        }
    }
}
