package vetores;
import java.util.Locale;
import java.util.Scanner;

public class alturas_nelio {
    static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int N = sc.nextInt();


        String[] names = new String[N];
        int[] ages = new int[N];
        double[] Heights = new double[N];

        double sum = 0.0;
        double menor = 0;

        for (int i = 0 ; i < N; i++){
            System.out.println("Dados da "+ (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            System.out.print("Altura: ");
            Heights[i] = sc.nextDouble();

            sum+= Heights[i];
            if (ages[i] < 16){
                menor++;
            }
        }
        double media = sum / N;
        System.out.printf("\nAltura média: %.2f" , media);
        System.out.println("\nPessoas com menos de 16 anos: " + (menor / N * 100.0) + "%");

        for (int i = 0 ; i < N; i++){
            if (ages[i] < 16){
                System.out.println(names[i]);
            }
        }
        sc.close();
    }
}
