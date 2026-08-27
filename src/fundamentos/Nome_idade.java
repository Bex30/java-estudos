package fundamentos;

import java.util.Scanner;

public class Nome_idade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seu nome: ");
        String fambas = sc.nextLine();

        System.out.println("idade");
        String Idade = sc.nextLine();

        System.out.println("Olá " + fambas + " " + Idade + " Anos de Idade");
    }
}
