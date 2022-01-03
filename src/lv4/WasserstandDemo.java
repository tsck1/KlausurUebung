package lv4;

import java.util.ArrayList;
import java.util.List;

public class WasserstandDemo {
    public static void main(String[] args) {

        Wasserstand w1 = new Wasserstand(1,"Mur",12.55,12,100000);
        System.out.println(w1);
        Wasserstand w2 = new Wasserstand(2,"Mur",10,12,125000);
        System.out.println(w2);
        Wasserstand w3 = new Wasserstand(3,"Enns",4.55,5,-120000);
        System.out.println(w3);
        Wasserstand w4 = new Wasserstand(4,"Enns",5.55,5,130000);
        System.out.println(w4);
        Wasserstand w5 = new Wasserstand(5,"Donau",12.55,13.5,110000);
        System.out.println(w5);
        Wasserstand w6 = new Wasserstand(6,"Donau",14.77,13.5,133000);
        System.out.println(w6);

        WasserstandManager wm = new WasserstandManager();
        wm.add(w1);
        wm.add(w2);
        wm.add(w3);
        wm.add(w4);
        wm.add(w5);
        wm.add(w6);

        Wasserstand w = wm.findById(2);
        System.out.println("id 2 ="+w);

        ArrayList<Wasserstand> ws= wm.findAllByGewaesser("Enns");
        System.out.println(ws);
        List<Wasserstand> wr = wm.findAllByGewaesser("Donau");
        System.out.println("Donau -> " + wr);

        w = wm.findLastWasserstand("Enns");
        System.out.println("latest "+w);
        System.out.println("------");
        w = wm.findoldestWasserstand("Enns");
        System.out.println("oldest "+w);

        double avgWsDonau= wm.calcMittlererWasserstand("Donau");
        System.out.println(avgWsDonau);

        wr = wm.findForAlarmierung();
        System.out.println("alarm -> " + wr);

        ws = wm.findByZeitpunkt(130000, 190000, "Donau");
        System.out.println("Donau innerhalb Zeitraum -> " + ws);

        ws = wm.findByZeitpunkt(80000, 150000, "Mur");
        System.out.println("Mur innerhalb Zeitraum -> " + ws);


    }
}
