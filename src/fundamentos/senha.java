package fundamentos;

import java.util.Scanner;

public class senha {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        System.out.println("Digite a fundamentos.senha");
        senha = sc.nextInt();
        while(senha != 2002){
            System.out.println("Senha incorreta");
            senha = sc.nextInt();
        }
        System.out.println("Logado!");
    }
}
