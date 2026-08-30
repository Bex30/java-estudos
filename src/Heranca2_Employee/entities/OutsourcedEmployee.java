package Heranca2_Employee.entities;

public class OutsourcedEmployee extends EmployeeH {
    private Double additionalCharge;

    public OutsourcedEmployee() {
    }


    public OutsourcedEmployee(String name, Integer hours, Double valuePer, Double additionalCharge) {
        super(name, hours, valuePer);
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }



    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public Double payment(){
    return super.payment() + additionalCharge * 1.10;
    }
}
