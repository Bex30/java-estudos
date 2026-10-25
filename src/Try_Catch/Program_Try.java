package Try_Catch;
import java.io.File;
import java.io.IOException; import java.util.Scanner;
public class Program_Try {
    public static void main(String[] args) {
        File file = new File("/Users/gabrielabexigaveloso/Documents/oi.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            IO.print("Closing program");
        }
    }
}