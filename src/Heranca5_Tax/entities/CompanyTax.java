package Heranca5_Tax.entities;

public class CompanyTax extends TaxPayer {
    private Integer employers;

    public CompanyTax() {
        super();
    }

    public CompanyTax(String name, Double anualRent, Integer employers) {
        super(name, anualRent);
        this.employers = employers;
    }

    public Integer getEmployers() {
        return employers;
    }

    public void setEmployers(Integer employers) {
        this.employers = employers;
    }

    @Override
    public Double TaxPay() {
        double sum = 0.0;
        if(employers <= 10){
            sum = getAnualRent() * 0.16;
        }
        if(employers > 10){
            sum = getAnualRent() * 0.14;
        }

        return sum;
    }
}
