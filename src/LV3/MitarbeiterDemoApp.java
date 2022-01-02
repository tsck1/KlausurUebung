package LV3;

public class MitarbeiterDemoApp {

    public static void main(String[] args) {
        Mitarbeiter mausi= new Mitarbeiter("Sabine","Pontasch",24500/12);

        System.out.println(mausi.monatsAbrechnung());
        System.out.println(mausi.jahresAbrechnung());
        System.out.println(mausi.jahresAbrechnung(6));
    }
}
