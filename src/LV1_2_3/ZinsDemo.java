package LV1_2_3;

public class ZinsDemo {

    public static void main(String[] args) {
        double kontostand;
        double zinsen;
        kontostand= 1500;
        zinsen= 2.25;
        double Zinsertrag = kontostand/100*zinsen;

        System.out.println("Der Zinsertrag beträgt: " +Zinsertrag + " €" );

        kontostand= 4000;
        zinsen=3;
        Zinsertrag= kontostand*zinsen/100;
        System.out.println(Zinsertrag);

        kontostand= 5000;
        zinsen=3;
        Zinsertrag= berechneZinsertrag(kontostand, zinsen);
        System.out.println(berechneZinsertrag(kontostand,zinsen));
        printZinsen(kontostand,zinsen,Zinsertrag);
    }
    public static double berechneZinsertrag(double kontostand, double zinsen){
        return kontostand*zinsen/100;
    }
    public static void printZinsen(double kontostand, double zinsen, double Zinsertrag){

        System.out.println("Zinsen = " +zinsen+ " % von " +kontostand+ "€ = " + Zinsertrag+ "€");
    }
}
