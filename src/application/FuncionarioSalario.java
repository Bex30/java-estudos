package application;
import entities.Employee;
import java.util.Scanner;

public class FuncionarioSalario {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Escreva o Nome do Funcionário");
        emp.Name = sc.nextLine();
        System.out.println("Salário Bruto");
        emp.GlossSalary = sc.nextDouble();
        System.out.println("Imposto");
        emp.Tax = sc.nextDouble();

        System.out.println(emp);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        emp.increaseSalary(percentage);

        System.out.printf("Update Data: " + emp.Name + ", " + emp.GlossSalary);
    }
}
