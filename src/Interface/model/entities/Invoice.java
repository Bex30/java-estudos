package Interface.model.entities;

public class Invoice {

    private double basicpayment;
    private double tax;

    public Invoice(){

    }

    public Invoice(double basicpayment, double tax) {
        this.basicpayment = basicpayment;
        this.tax = tax;
    }

    public double getBasicpayment() {
        return basicpayment;
    }

    public void setBasicpayment(double basicpayment) {
        this.basicpayment = basicpayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment(){
        return getBasicpayment() + getTax();
    }
}
