package entities;

public class Employee {
    public String Name;
    public double GlossSalary;
    public double Tax;

    public double NetSalary(){
    return GlossSalary - Tax;
    }
    public void increaseSalary(double percentage){
    GlossSalary = GlossSalary * (percentage / 100 + 1);
    }

    public String toString(){
        return "Name: " + Name
                + ", $ " + String.format("%.2f", NetSalary());

    }
}
