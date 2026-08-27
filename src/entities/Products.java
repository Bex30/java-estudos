package entities;

public class Products {
    private String Name;
    private double Price;
    private int Quantity;

    public Products(){

    }

    public Products(String Name, double Price, int Quantity){
    this.Name = Name;
    this.Price = Price;
    this.Quantity = Quantity;
    }

    public Products(String Name, double Price){
        this.Name = Name;
        this.Price = Price;
        Quantity = 0; //opcional, int vazio já é 0;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice (double price){
        this.Price = price;
    }

    public double getQuantity(){
        return Quantity;
    }

    public double TotalValueInStock(){

        return  Price * Quantity;
    }

    public void AddProducts(int Quantity){

        this.Quantity += Quantity;
    }

    public void RemoveProducts(int Quantity){

        this.Quantity -= Quantity;
    }

    public String toString(){
        return Name
        + ", $ "
        + String.format("%.2f", Price)
        + ", "
        + Quantity
        + " units, Total $ "
        + String.format("%.2f", TotalValueInStock());
    }
}
