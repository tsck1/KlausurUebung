package lv6_Vererbung_UZ_Bsp2;

import java.util.ArrayList;
import java.util.HashMap;

public class KontoDemo {

    public static void main(String[] args) {
        GiroKonto test = new GiroKonto("Walter Verwalter",400);
        System.out.println(test.kontostand);
        test.auszahlen(200);
        System.out.println(test.kontostand);

        JugendGiroKonto test2 = new JugendGiroKonto("Klausi",200,400);
        test2.einzahlen(300);
        System.out.println(test2.kontostand);
        test2.auszahlen(1000);
        System.out.println(test2.kontostand);
        System.out.println("-------");

        Konto k = test2;
        k.auszahlen(600);
        System.out.println(k.kontostand);
        System.out.println("kkkkkkkkkkk");
        GiroKonto g  =(JugendGiroKonto) k;
        g.auszahlen(500);
        System.out.println(g.kontostand+"Down");

        Sparkonto test3= new Sparkonto("Mathe");
        test3.einzahlen(200);
        System.out.println(test3.kontostand);
        test3.auszahlen(200);
        System.out.println(test3.kontostand);
        System.out.println("-----------");

        Konto k1 = new Konto("Matthias");
        GiroKonto k2 = new GiroKonto("Matthias", 1000);
        JugendGiroKonto k3 = new JugendGiroKonto("Matthias", 1000, 200);

        ArrayList<Konto> konten=new ArrayList<>();
        konten.add(test);
        konten.add(test2);
        konten.add(test3);
        konten.add(k1);
        konten.add(k2);
        konten.add(k3);
        //System.out.println(konten.toString());

        HashMap<String,Integer> map = new HashMap<>();
        for(Konto konto:konten){
            if (!map.containsKey(konto.inhaber))
            {
                map.put(konto.inhaber, 1);
            }
            else
            {
                int value = map.get(konto.inhaber);
                map.put(konto.inhaber, value + 1);
            }

        }
        System.out.println(map);

    }
}
