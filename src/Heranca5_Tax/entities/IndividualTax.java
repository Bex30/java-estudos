package Heranca5_Tax.entities;

public class IndividualTax extends TaxPayer {
    private Double healthySpent;

    public IndividualTax() {

    }

    public IndividualTax(String name, Double anualRent, Double healthySpent) {
        super(name, anualRent);
        this.healthySpent = healthySpent;
    }

    public Double getHealthySpent() {
        return healthySpent;
    }

    public void setHealthySpent(Double healthySpent) {
        this.healthySpent = healthySpent;
    }

    @Override
    public Double TaxPay() {
        double sum = 0.0;
        if(getAnualRent() < 20000){
            sum = (getAnualRent() * 0.15) - (getHealthySpent() * 0.5);
        }
        if(getAnualRent() >= 20000){
            sum = (getAnualRent() * 0.25) - (getHealthySpent() * 0.5);
        }
        return sum;
    }
}
