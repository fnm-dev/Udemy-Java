package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        for (int i = 1; i <= months; i++) {
            LocalDate date = contract.getDate().plusMonths(i);
            double amount = contract.getTotalValues()/months;

            amount += onlinePaymentService.interest(amount, i);
            amount += onlinePaymentService.paymentFee(amount);

            contract.getInstallments().add(new Installment(date, amount));
        }
    }
}
