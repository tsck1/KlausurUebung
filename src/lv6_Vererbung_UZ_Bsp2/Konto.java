package lv6_Vererbung_UZ_Bsp2;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0;
    }
    public void einzahlen(double wert){
        this.kontostand +=wert;
    }
    public void auszahlen(double wert){
        this.kontostand -=wert;
    }
}
