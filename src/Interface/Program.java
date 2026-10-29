package Interface;

import Interface.model.entities.CarRental;
import Interface.model.entities.Vehicle;
import Interface.model.services.BrazilTaxService;
import Interface.model.services.RentalService;
import jdk.swing.interop.SwingInterOpUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, new Vehicle(model), finish);

        System.out.print("Entre com o preço por hora:");
        double perHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia:");
        double perDay = sc.nextDouble();

        RentalService rentalService  = new RentalService(perHour, perDay, new BrazilTaxService());

       rentalService.processInvoice(cr);


        System.out.println("FATURA:");
        System.out.println("Pagamento Básico: "+ String.format("%.2f",cr.getInvoice().getBasicpayment()));
        System.out.println("Imposto: "+ String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Pagamento total: "+ String.format("%.2f",cr.getInvoice().getTotalPayment()));
    }
}
