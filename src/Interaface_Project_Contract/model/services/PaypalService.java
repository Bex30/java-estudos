package Interaface_Project_Contract.model.services;

public class PaypalService implements OnlinePaymentService{


    public double interest(Double amount, Integer month) {
        return amount * 0.01 * month;
    }


    public double paymentFee(Double amount){

        return (amount + (amount * 0.02));
    }
}
