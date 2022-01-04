package lV_Vererbung_Polymorphismus;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

    private ArrayList<Employee> listEmployees = new ArrayList<>();

    public void addEmployee(Employee emp){
        listEmployees.add(emp);

    }

    public HashMap<String, Double> getSalaryByDepartment(){
        HashMap<String, Double> result= new HashMap<>();

        for (Employee emp:listEmployees){
            String dep = emp.getDepartment();//Key
            double salary =emp.getFullSalary(); //Value

            if(result.containsKey(dep)){
                //ja
                double currentValue = result.get(dep);
                result.put(dep,currentValue+salary);
            }
            else {
                //nein
                result.put(dep, salary);
            }
        }
        return result;
    }
    public double getTotalSalary() {
        double sum = 0;

        for (Employee e: listEmployees) {
            sum += e.getFullSalary();
        }

        return sum;
    }
    public double getAverageSalary(){
        return getTotalSalary()/listEmployees.size();
    }
    public HashMap<String, Integer> getCountInDepartment() {
        HashMap<String, Integer> result = new HashMap<>();

        for (Employee emp : listEmployees) {
            if(result.containsKey(emp.getDepartment())){
                    result.put(emp.getDepartment(), result.get(emp.department) + 1);
        }
            else{
            result.put(emp.getDepartment(), 1);
            }
        }
        return result;

    }
}
