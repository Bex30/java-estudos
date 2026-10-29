package Files1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Date date = sdf.parse(sc.next());

        System.out.print("Enter a folder path: ");
        String strpath = sc.nextLine();

        File path = new File(strpath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");
        for(File folder : folders){
            System.out.println(folder);
            //if(folder.getName().equals("WinSAT")){
            if(folder.getAbsolutePath().equals("C:\\Users\\lucas\\AppData\\Local\\Temp\\WinSAT")){
                System.out.println("Amo");
            }
        }

        File[] files = path.listFiles(File :: isFile);
        System.out.println("FILES:");
        for(File file:files){
            System.out.println(file);

        }

        boolean success = new File(strpath + "\\subdir").mkdir();
        System.out.println("Diretory created successfully: "+ success);


        sc.close();
    }
}
