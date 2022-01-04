package lV_Vererbung_Polymorphismus;

public class Employee {

    protected String firstname;
    protected String lastname;
    protected String department;
    protected double baseSalary;

    public Employee(String firstname, String lastname, String department, double baseSalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary() {
        return baseSalary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }
}
