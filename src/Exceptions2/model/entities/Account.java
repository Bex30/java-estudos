package Exceptions2.model.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdraw) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdraw;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount){
        if(amount > withdrawLimit){
            throw new BexException("The amount exceeds withdraw limit");
        }
        if(amount > balance){
            throw new BexException("Not enough balance");
        }
    balance -= amount;
    }
    public void deposit(Double amount){
    balance += amount;
    }
}
