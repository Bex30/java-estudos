package List;

import entities.Employee_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Employee_lambda {
  public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Employee_List> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id = 0;

        System.out.print("How many employees will be registered?");
        int many = sc.nextInt();

        for(int i = 0; i < many; i++){
            System.out.println("Emplyoee #" + (i+1) + ":");
            System.out.print("Id: ");
            id = sc.nextInt();
            while (hasId(list, id) == true) { //pode ser apenas while (hasId(list, id), deixei true p
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee_List lista  = new Employee_List(id, name, salary);
            list.add(lista);

        }

        double percentage = 0;
        System.out.println("Enter the employee id that will have salary increase :");
        int id1 = sc.nextInt();


        Employee_List emp = list.stream().filter(x -> x.getId() == id1).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This Id dont exist");
        }
        else{
            System.out.println("Enter the percentage");
            percentage = sc.nextDouble();
            emp.Increase_salary(percentage);
        }

        for(Employee_List x : list){
            System.out.println(x);
        }

        sc.close();
    }
    public static boolean hasId(List<Employee_List> list, int id) {
        Employee_List emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
