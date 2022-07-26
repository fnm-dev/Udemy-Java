package entities;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance=0.0;

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double depositValue){
        accountBalance += depositValue;
    }

    public void withdraw(double withdrawValue){
        accountBalance -= withdrawValue + 5.00;
    }

    @Override
    public String toString() {
        return "Account "
                    + accountNumber
                    + ", Holder: "
                    + accountHolder
                    + ", Balance: $ "
                    + String.format("%.2f", accountBalance);
    }
}
