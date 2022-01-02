package LV3;

public class Bestellung {

    private String orderNumber;
    private Bestellzeile[] zeilen;

    public Bestellung(String orderNumber, Bestellzeile[] zeilen) {
        this.orderNumber = orderNumber;
        this.zeilen = zeilen;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }
    public void printBestellung(){
        System.out.println("Bestellnummer: "+this.orderNumber);
        for (int i=0; i<this.zeilen.length;i++){
            //Eigene Lösung mit toString
            // System.out.println(this.zeilen[i].toString());
            Bestellzeile bz = this.zeilen[i];
            System.out.println(bz.getArticleName()+" - " +bz.getArticleQuantity()+ " Stück zu je "
            +bz.getArticlePrice()+ " EUR = "+bz.getKosten()+" EUR");
        }
        System.out.println("Gesamtpreis: "+getKosten()+" EUR");
        System.out.println("Duchschnittspreis: "+getAverageKosten()+" EUR");
    }
    public double getKosten(){
        double summOrder=0;
       for (int i=0;i<this.zeilen.length;i++){
           Bestellzeile bz=this.zeilen[i];
           summOrder= summOrder+ bz.getKosten();
       }

    return summOrder;
    }
    public double getAverageKosten(){
        return getKosten()/(this.zeilen.length*1.0);
    }
}
