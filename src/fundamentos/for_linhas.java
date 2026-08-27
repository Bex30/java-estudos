package fundamentos;

import java.util.Scanner;

public class for_linhas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a quantidade de linhas que você requer");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i+" "+i * i +" "+ i * i * i);
        }

    }
}
