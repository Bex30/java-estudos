package List;

import entities.Employee_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Employee {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Employee_List> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        Integer id = 0;

        System.out.print("How many employees will be registered?");
        int many = sc.nextInt();

        for(int i = 0; i < many; i++){
            System.out.println("Emplyoee #" + (i+1) + ":");
            System.out.print("Id: ");
             id = sc.nextInt();
                do {
                    for (Employee_List emplyee : list) {
                        flag = false;
                        if (emplyee.getId() == id) {
                            flag = true;
                            System.out.println("ID REPETIDO");

                            id = sc.nextInt();
                            break;
                        }
                    }
                }while(flag == true);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee_List lista  = new Employee_List(id, name, salary);
            list.add(lista);

        }

        double percentage = 0;
        System.out.println("Enter the employee id that will have salary increase :");
        int id1 = sc.nextInt();

        Boolean found = false;
        for(int i = 0; i < list.size() ; i++){
            Employee_List emp = list.get(i);
            if(emp.getId() == id1){
                System.out.println("Enter the percentage:");
                 percentage = sc.nextDouble();
                emp.Increase_salary(percentage);
                 found = true;
                 break;
            }

        }

        if (!found){
            System.out.println("This id does not exist!");
        }

        for(Employee_List x : list){
            System.out.println(x);
        }

sc.close();
    }
}
