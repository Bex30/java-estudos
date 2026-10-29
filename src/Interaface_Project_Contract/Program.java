package Interaface_Project_Contract;

import Interaface_Project_Contract.model.entities.Contract;
import Interaface_Project_Contract.model.entities.Installment;
import Interaface_Project_Contract.model.services.ContractService;
import Interaface_Project_Contract.model.services.PaypalService;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
try {


        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        int Contractnum = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy):");
        Date date = sdt.parse(sc.nextLine());
        System.out.print("Valor do contrato ");
        double ContractValue = sc.nextDouble();

        Contract contract = new Contract(Contractnum, ContractValue, date);

        System.out.print("Entre com o numero de parcelas: ");
        int month = sc.nextInt();

        ContractService cr = new ContractService(new PaypalService());
        cr.processContract(contract, month);

        System.out.println("Parcelas:");

        for(Installment installment : contract.getInstallment() ){
            System.out.println(sdt.format(installment.getDueDate()) + " - " + String.format("%.2f",installment.getAmount()));
        }

}
catch (ParseException e){
    e.printStackTrace();
}

    }
}
