package Interaface_Project_Contract.model.services;

import Interaface_Project_Contract.model.entities.Contract;
import Interaface_Project_Contract.model.entities.Installment;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class ContractService {

    OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }


    public void processContract(Contract contract, Integer month){
    double implement = contract.getTotalValue() / month;
    for (int i = 1; i <= month; i++) {
        double sum = 0;
        double interest = paymentService.interest(implement, i);
        sum = interest + implement;
        double permonth = paymentService.paymentFee(sum);
        Calendar cal = Calendar.getInstance();
        cal.setTime(contract.getDate());
        cal.add(Calendar.MONTH, i);
        Date dueDate = cal.getTime();
        contract.addinstallment(new Installment(dueDate, permonth));
    }
    }


}
