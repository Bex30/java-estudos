package Files2_Challenge;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.useDelimiter("[,\\n\\r]+");
        File path = new File("D:\\out");
        File arquivo = new File(path, "summary.csv");
        try {
            boolean statusArq = arquivo.createNewFile();
            System.out.print(statusArq);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\out\\summary.csv"));) {

            while (sc.hasNextLine()) {
                String conteudo = sc.nextLine();

                String[] fields = conteudo.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                double total = quantity * price;

                bw.write(name + "," + total);
                bw.newLine();
            }
        }
           catch(IOException e){
                    e.printStackTrace();
                }

            }
        }

