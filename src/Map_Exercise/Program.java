package Map_Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter file full path: ");
        //File path = new File(sc.next());
        Map<String, Integer> Map = new LinkedHashMap<>();
        File path = new File("/Users/gabrielabexigaveloso/Downloads/votos.csv");
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int votes = Integer.parseInt(parts[1]);
                Map.merge(name, votes, Integer::sum);
                line = br.readLine();
            }
            for (Map.Entry<String, Integer> entry : Map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }



        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
