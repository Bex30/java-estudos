package application;
import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle X;
        X = new Rectangle();
        System.out.println("Digite a Altura do retangulo: ");
        X.Height = sc.nextDouble();

        System.out.println("Digite o Comprimento do retangulo: ");
        X.Width = sc.nextDouble();

        System.out.println(X);
    }

}
