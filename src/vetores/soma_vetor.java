package vetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int N = sc.nextInt();
        double[] vect = new double[N];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero:");
            vect[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < vect.length; i++){
            sum += vect[i];
        }
        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++){
            System.out.printf("%.1f  ",vect[i]);
        }
        System.out.printf("\nSOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n", (sum / N));

    sc.close();
    }
}
