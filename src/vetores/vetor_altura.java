package vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetor_altura {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas");
        int n = sc.nextInt();
        double[] h = new double[n];
        double sum = 0.0;
        for (int i = 0; i < n; i++){
            System.out.println("Digite a altura da pessoa "+ (i + 1));
            h[i] = sc.nextDouble();

        }
        for (int i = 0; i < n; i++){
            sum += h[i];
        }


        double media = sum / n;
        System.out.printf("%.2f%n",media);
        sc.close();
    }


}
