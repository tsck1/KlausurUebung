package lv6_Vererbung_UZ_Bsp2;

public class Sparkonto extends Konto{

    public Sparkonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void auszahlen(double wert) {
        if(kontostand-wert<0){
            System.out.println("nicht genügen Guthaben");
        }
        else {
            kontostand-=wert;
        }

    }

    @Override
    public String toString() {
        return "Sparkonto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
