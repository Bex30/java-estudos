package Interface.model.services;

import Interface.model.entities.CarRental;
import Interface.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double PricePerHour;
    private Double PricePerDay;

    TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        PricePerHour = pricePerHour;
        PricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        double days = hours / 24.00;

        double basicPayment;
        if(hours <= 12){
            basicPayment = PricePerHour * Math.ceil(hours);
        }
        else{
            basicPayment = PricePerDay * Math.ceil(days);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
