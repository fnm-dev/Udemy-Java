package entities;

public class Company extends TaxPayer{

    private int employees;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, int employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public double tax() {
        if(employees <= 10){
            return super.getAnualIncome() * 0.16;
        } else{
            return super.getAnualIncome() * 0.14;
        }
    }


}
