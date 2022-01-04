package lv6_vererbung;

import java.util.ArrayList;

public class Customer extends Person {

    private int customerNumber;
    private ArrayList<Address> addresses; // = new ArrayList<>();

    public Customer(int customerNumber, String firstname, String lastname) {
        super(firstname, lastname); // super(...parameters...) ruft den Konstruktor der Basisklasse auf

        this.customerNumber = customerNumber;
        addresses = new ArrayList<>();
        // ArrayList addresses muss entweder direkt bei Attribut, oder in (allen) Konstruktoren initialisiert werden
    }

    // auch Konstruktoren kann man überladen
    public Customer(int customerNumber, ArrayList<Address> addresses) {
        super("", "");

        this.customerNumber = customerNumber;
        this.addresses = addresses;
    }


    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                ", firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                '}';
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
