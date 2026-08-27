package application;

import entities.TrimesterNota;

import java.util.Scanner;

public class AlunoNotaTrimestre {
    public static void main(String[] args) {
        double falta = 0.00;
        Scanner sc = new Scanner(System.in);
        TrimesterNota tri =  new TrimesterNota();
        System.out.println("Digite o seu Nome");
        tri.Name = sc.nextLine();

        do  {
            System.out.println("Digite sua nota do Primeiro Trimestre");
            tri.Nota1 = sc.nextDouble();
        } while (tri.Nota1 > 30);
        do  {
            System.out.println("Digite sua nota do Segundo Trimestre");
            tri.Nota2 = sc.nextDouble();
        } while (tri.Nota2 > 35);
        do {
            System.out.println("Digite sua nota do Terceiro Trimestre");
            tri.Nota3 = sc.nextDouble();
        } while (tri.Nota3 > 35);

        double notafinal = tri.notatotal();
        System.out.println(tri);


        if (notafinal < 60) {
            System.out.println("\nFAILED");
          falta = 60 - notafinal;
            System.out.println("MISSING " + falta + " POINTS");
        }
        else {
            System.out.println("PASS");
        }
    }
}
