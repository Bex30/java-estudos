package Lambda_Exercise;

import Lambda_Exercise.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the file path");
        //String path = sc.nextLine();
        String path = "/Users/gabrielabexigaveloso/Downloads/emplo.csv";
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.println("Email of people whose salary is more than " + salary + ":");
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Employee> emplo = new ArrayList<>();
            while(line != null){
            String [] fields = line.split(",");
            String name = fields[0];
            String email = fields[1];
            double salaryf = Double.parseDouble(fields[2]);
            emplo.add(new Employee(name, salaryf, email));
            line = br.readLine();
            }
           // Comparator<String> comp = (x,y) -> x.toUpperCase().compareTo(y.toUpperCase()); opcional pois o sorted cru já organiza em ordem alfabetica
            List<String> list = emplo.stream().filter(s -> s.getSalary() > salary).map(x-> x.getEmail()).sorted().toList();

            double sum = emplo.stream().filter(n -> n.getName().charAt(0) == 'M').map(x-> x.getSalary()).reduce(0.0, (a,b) -> a+b);
            list.forEach(System.out::println);
            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
