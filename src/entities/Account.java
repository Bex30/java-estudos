package entities;

public class Account {
    private int number;
    private String name;
    private double deposit;

    public Account() {

    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        Deposit(initialDeposit);
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
        this.deposit = 0; // opcional, 0 ja é o default de double
    }


    public int getNumber() {
        return number;
    }

    public double getDeposit() {
        return deposit;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Account data:\n" +
                "Account "
                + number
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", deposit);
    }

    public void Deposit (double deposit){
        this.deposit += deposit;
    }

    public void WithDraw (double withdraw){

        this.deposit -= withdraw + taxa;
    }
    private static final double taxa = 5;
}
