package lv6_Vererbung_UZ_Bsp2;

public class JugendGiroKonto extends GiroKonto {

    private double buchungsslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungsslimit) {
        super(inhaber, limit);
        this.buchungsslimit = buchungsslimit;
    }

    @Override
    public void auszahlen(double wert) {
        if(wert>buchungsslimit){
            System.out.println("Wert je Buchung überschritten");
        }else {
        super.auszahlen(wert);}
    }

    @Override
    public String toString() {
        return "JugendGiroKonto{" +
                "limit=" + limit +
                ", buchungsslimit=" + buchungsslimit +
                ", inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
