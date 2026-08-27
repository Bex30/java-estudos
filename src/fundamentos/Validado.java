package fundamentos;

import java.util.Scanner;

public class Validado {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Qual a nota?");
        int nota = sc.nextInt();

        if (nota < 6 ){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Aprovado");
        }
    }
}
