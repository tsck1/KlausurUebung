package lv6_vererbung;

import java.util.ArrayList;

public class HasenStallDemoApp {

    public static void main(String[] args) {

        Hase allgFeldhase= new Hase("Feldhase 1");
        Weihnachtshase santa = new Weihnachtshase("Santa",300);
        Osterhase felix= new Osterhase("Felix");

        santa.fressen();
        santa.verteilen();
        santa.verteilen();
        santa.verteilen();
        santa.hoppeln();
        System.out.println("----");
        //up-casting

        System.out.println("up-casting");
        Hase wh = santa;
        Hase xy = santa;
        System.out.println("----");
        xy.fressen();
        System.out.println("----");

        Hase wh2 = new Weihnachtshase("Christkind",15);
        wh.fressen();
        wh2.verteilen();
        wh2.verteilen();

        Hase oh = new Osterhase("Oster-hase");
        oh.verteilen();

        System.out.println("----");
        // down-casting
        System.out.println("down-casting");

        Osterhase oh2 = (Osterhase) oh;
        oh2.verteilen();
        oh2.bemaleOstereier();

        //geht nicht wh2 ist ein weihnachtshase
        //Osterhase wh2AlsOsterhase = (Osterhase) wh2;
       // wh2AlsOsterhase.bemaleOstereier();

        ArrayList<Hase> stall=new ArrayList<>();
        stall.add(felix);
        stall.add(wh);
        stall.add(wh2);
        stall.add(santa);
        stall.add(oh);
        stall.add(oh2);
        stall.add(allgFeldhase);
        System.out.println("Hasenstall mit Hasenobjekten");

        for (Hase h: stall){
            h.fressen();
        }
        for (Hase h: stall){
            h.verteilen();
        }
    }
}
