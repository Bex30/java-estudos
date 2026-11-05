package Generics_Files.entities;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }

}

    /*    @Override
    public int compareTo(Product other) {
        return -price.compareTo(other.getPrice()); //negativo, só colocar menos antes da operação
    } //ele funciona para fazer override no processo do collections.list

    */