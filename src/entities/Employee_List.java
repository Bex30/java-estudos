package entities;

public class Employee_List {
    private Integer id;
    private String name;
    private Double salary;

    public Employee_List() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee_List(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void Increase_salary(double percentage){
        salary = salary * (percentage / 100 + 1);
    }

    @Override
    public String toString() {
        return "Employee_List" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary= " + String.format("%.2f", salary);

    }

}
