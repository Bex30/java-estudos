package Heranca2_Employee.entities;

public class EmployeeH {
    private String name;
    private Integer hours;
    private Double valuePer;

    public EmployeeH() {
    }
    public EmployeeH(String name, Integer hours, Double valuePer) {
        this.name = name;
        this.hours = hours;
        this.valuePer = valuePer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePer() {
        return valuePer;
    }

    public void setValuePer(Double valuePer) {
        this.valuePer = valuePer;
    }

    public Double payment(){
        return valuePer * hours;
    }
}
