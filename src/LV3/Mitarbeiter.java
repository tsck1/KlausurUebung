package LV3;

public class Mitarbeiter {

    private String firstName;
    private String lastName;
    private int embloyeeNumber;
    private double salary;
    private int age;
    private static int s_number=0;

    public Mitarbeiter(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        embloyeeNumber=++s_number;
    }
    public double monatsAbrechnung(){
        double jahresGehalt = salary*12;
        double jahresGehaltOSV= jahresGehalt*0.8;

        double steuer=0;
        if (jahresGehaltOSV>10000){
            steuer=(10000*0.1);
            if(jahresGehaltOSV>20000){
                steuer +=(10000*0.2);
                if(jahresGehaltOSV>30000){
                    steuer +=(10000*0.32);
                    if(jahresGehaltOSV>50000){
                        steuer +=(10000*0.6);
                    }
                    else {
                        steuer +=(jahresGehaltOSV-30000)*0.45;
                    }
                }
                else {
                    steuer +=(jahresGehaltOSV-20000)*0.32;
                }
            }
            else {
            steuer += (jahresGehaltOSV-10000)*0.2;
            }

        }
        else steuer = jahresGehaltOSV*0.1;

        return (jahresGehaltOSV-steuer)/12;

    }
    public double jahresAbrechnung(){
        return monatsAbrechnung()*12;
    }
    public double jahresAbrechnung(int monate){
        return monatsAbrechnung()*monate;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmbloyeeNumber() {
        return embloyeeNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
