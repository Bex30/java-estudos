package Interface_Comparable.entities;

public class Employee implements Comparable<Employee>{

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        return name.compareTo(e.getName());
    }
/*
    public int compareTo(Employee e) {
        return salary.compareTo(e.getSalary());
    }

    public int compareTo(Employee e) {
        return -salary.compareTo(e.getSalary()); // ordem decrescente
    }
*/

}
