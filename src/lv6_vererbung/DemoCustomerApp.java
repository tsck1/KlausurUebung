package lv6_vererbung;

import java.util.ArrayList;

public class DemoCustomerApp {

    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Max","Mustermann");
        Customer customer2 = new Customer(2,new ArrayList<>());

        customer1.setFirstname("Klaus");
        customer1.setLastname("Klasen");

        customer2.setFirstname("Susi");
        customer2.setLastname("Sorglos");

        customer1.print();
        customer2.print();
    }
}
