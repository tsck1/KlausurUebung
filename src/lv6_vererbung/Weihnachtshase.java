package lv6_vererbung;

public class Weihnachtshase extends Hase{

    private int countGifts;

    public Weihnachtshase(String name, int countGifts) {
        super(name);
        this.countGifts = countGifts;
    }
    public Weihnachtshase(String name){
        super(name);
        this.countGifts = 1;
    }

    @Override // Annotation
    public void verteilen() {
        System.out.println(name + " legt die Geschenke unter den Christbaum. Anzahl Geschenke: "
                + countGifts);
//        super.verteilen();
        countGifts--;
    }
}
