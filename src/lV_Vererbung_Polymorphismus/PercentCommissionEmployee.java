package lV_Vererbung_Polymorphismus;

public class PercentCommissionEmployee extends Employee{

    private double percentCommision;

    public PercentCommissionEmployee(String firstname, String lastname, String department, double baseSalary, double percentCommision) {
        super(firstname, lastname, department, baseSalary);
        this.percentCommision = percentCommision;
    }

    @Override
    public double getFullSalary() {
        return super.getFullSalary()*(1+percentCommision/100.0);
    }
}
