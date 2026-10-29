package Interaface_Project_Contract.model.services;

public interface OnlinePaymentService {

    public double paymentFee(Double amount);
    public double interest(Double amount, Integer month);
}
