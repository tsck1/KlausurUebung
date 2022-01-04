package lv6_Vererbung_UZ_Bsp2;

public class GiroKonto extends Konto{

    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void auszahlen(double wert) {
        if(kontostand-wert<(limit*-1)){
            System.out.println("Limit ünerschritten");
        }
        else {
            super.auszahlen(wert);
        }
    }

    @Override
    public String toString() {
        return "GiroKonto{" +
                "limit=" + limit +
                ", inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
