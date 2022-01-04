package lV_Vererbung_Polymorphismus;

public class FixComissionEmployee extends Employee {

    private double additionalCommision;

    public FixComissionEmployee(String firstname, String lastname, String department, double baseSalary, double additionalCommision) {
        super(firstname, lastname, department, baseSalary);
        this.additionalCommision = additionalCommision;

    }

    @Override
    public double getFullSalary() {
        return super.getFullSalary()+additionalCommision;
    }
}
