package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {

    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        List<Installment> installments = new ArrayList<>();
        LocalDate date = contract.getDate().plusMonths(1);

        for (int i = 1; i < months + 1; i++) {
            double amount = contract.getTotalValues()/months;

            amount += onlinePaymentService.interest(amount, i);
            amount += onlinePaymentService.paymentFee(amount);

            installments.add(new Installment(date, amount));

            date = date.plusMonths(1);
        }
        contract.setInstallments(installments);
    }
}
