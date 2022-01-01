package If_While_for;

public class DemKontoApp {

    public static void main(String[] args) {
        System.out.println(Konto.s_anzahlKonto);

        Konto p1= new Konto ("Max Mustermann");
        System.out.println(Konto.s_anzahlKonto);
        Konto p2= new Konto("Susi Sorglos");
        System.out.println(Konto.s_anzahlKonto);
       p1.print();
       p1.aufbuchen(30000);
       p1.print();
       p2.print();
       p2.aufbuchen(200);
       p2.print();
       p2.abbuchen(100);
       p2.print();




    }
}
