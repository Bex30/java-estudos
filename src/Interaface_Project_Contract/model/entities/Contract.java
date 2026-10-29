package Interaface_Project_Contract.model.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalValue;

    List<Installment> installment = new ArrayList<>();

    public Contract(Integer number, Double totalValue, Date date) {
        this.number = number;
        this.totalValue = totalValue;
        this.installment = installment;
        this.date = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getInstallment() {
        return installment;
    }

    public void addinstallment(Installment in) {
        installment.add(in);
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
