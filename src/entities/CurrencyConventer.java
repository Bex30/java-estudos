package entities;

public class CurrencyConventer {
    public static double IOF = 0.06;
    public static double converter(double dinero, double price){
        return dinero * price * (1 + IOF);
    }
}
