package fundamentos;

import java.util.Scanner;

public class Imparoupar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Número");
        int nn = sc.nextInt();

        if (nn % 2 == 0){
            System.out.println("Par");
        }

    else{
            System.out.println("Ímpar");
        }
    }
}