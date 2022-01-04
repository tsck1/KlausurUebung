package lv6_vererbung;

public class Osterhase extends Hase {
    public Osterhase(String name) {
        super(name);
    }
    @Override
    public void verteilen() {
        System.out.println(name + " versteckt die Geschenke und Ostereier");
    }

    public void bemaleOstereier(){
        System.out.println(name + " bemalt die Ostereier");
    }
}
