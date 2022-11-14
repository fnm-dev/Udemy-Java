package model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double totalValues;
    private List<Installment> installments;

    public Contract(Integer number, LocalDate date, Double totalValues) {
        this.number = number;
        this.date = date;
        this.totalValues = totalValues;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValues() {
        return totalValues;
    }

    public void setTotalValues(Double totalValues) {
        this.totalValues = totalValues;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }
}
