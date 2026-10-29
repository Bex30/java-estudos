package Files1;

import java.io.*;

public class Program2 {
    public static void main(String[] args) {

        String[] lines = new String[]{ "Good Morning", "Good Afternoon", "Good Night"};

        String path = "D:\\in.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
            catch(IOException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

