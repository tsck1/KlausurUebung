package If_While_for;

public class Konto {
    private String kontoInhaber;
    private double kontoStand;
    private int idNumber;
    public static int s_anzahlKonto = 10;

    public Konto(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
        kontoStand = 0;
        this.idNumber = ++s_anzahlKonto;
    }

    public void setKontoInhaber(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
        kontoStand=0;

    }

    public void aufbuchen(double betrag){
        if (betrag>0){
           kontoStand=kontoStand+betrag;
        }else {
            System.out.println("Nur Werte größer 0 sind erlaubt");
        }
    }
    public void abbuchen(double betrag){
        if (kontoStand>betrag){
           kontoStand -= betrag;
        }else {
            System.out.println("Nicht genügend Geld am Konto!");
        }
    }
    public void print(){
        System.out.println(idNumber+ " Kontoinhaber: "+kontoInhaber+", Kontostand: "+kontoStand);
    }
}
