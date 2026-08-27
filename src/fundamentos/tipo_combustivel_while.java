package fundamentos;

import java.util.Scanner;

public class tipo_combustivel_while {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva seu tipo de Combustivel \n 1 Álcool\n 2 Gasolina \n 3 Diesel \n 4 Fim");
        int tipo = sc.nextInt();
        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;

    while (tipo != 4){
        if (tipo == 1){
            Alcool++;
        }
        if (tipo == 2){
            Gasolina++;
        }
        if (tipo == 3){
            Diesel++;
        }
        tipo = sc.nextInt();
    }
        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: "+ Alcool + "\nGasolina: " + Gasolina + "\nDiesel: " + Diesel);


    }
}
