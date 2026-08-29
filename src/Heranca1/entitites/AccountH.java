package Heranca1.entitites;

public class AccountH {
    
    private Integer number;
    private String holder;
    protected Double balance;

    public AccountH(){

    }

    public AccountH(Integer number, String holder, Double balance ) {
        this.number = number;
        this.balance = balance;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public Double getBalance() {
        return balance;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void withDraw(double amount){
        balance -= amount + 5.0;
    }

    public void deposit(double amount){
        balance += amount;
    }

}
