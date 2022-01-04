package lV_Vererbung_Polymorphismus;

public class EmployeeDemo {

    public static void main(String[] args) {

        EmployeeManager em = new EmployeeManager();
        em.addEmployee(new FixComissionEmployee(
                "Susi","Sorglos","Finanz",3500,200))
        ;em.addEmployee(new PercentCommissionEmployee(
                "Peter","Planlos","Pfusch",500,3));
        em.addEmployee(new Employee(
                "Susi","Sorglos","Finanz",1500));

        System.out.println("gesamte Lohnkosten: "+em.getTotalSalary());

        System.out.println(em.getSalaryByDepartment());
        System.out.println(em.getCountInDepartment());
    }


}
