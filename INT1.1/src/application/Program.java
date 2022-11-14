package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract details:");
        System.out.print("Enter the number of contract: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date: ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Value: ");
        double value = sc.nextDouble();

        Contract contract = new Contract(number, date, value);

        System.out.print("Number of installments: ");
        int months = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
