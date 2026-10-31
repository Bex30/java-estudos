package Interface_Comparable;
import Interface_Comparable.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(); String path = "/Users/gabrielabexigaveloso/Documents/Java_Arquivo/dados.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String EmployeeCsv = br.readLine();
            while (EmployeeCsv != null) {
                String[] EmployeeArray = EmployeeCsv.split(",");
                String name = EmployeeArray[0];
            double salary = Double.parseDouble(EmployeeArray[1]);
            list.add(new Employee(name, salary));
            EmployeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee s : list) {
                System.out.println(s.getName() + ", "  + s.getSalary()); }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } }
}
