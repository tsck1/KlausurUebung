package lv4;

import java.util.ArrayList;

public class EventDemo {
    public static void main(String[] args) {

        Event e1 = new Event("kino X", "Gratkorn", 21);
        Event e2 = new Event("Konzert X", "Graz", 65);
        Event e3 = new Event("Fußballspiel", "Graz", 23);
        Event e4 = new Event("Eishockey", "Graz", 18);
        Event e5 = new Event("Konzert Y", "Wien", 77);

        EventKalender ek1 = new EventKalender();
        ek1.add(e1);
        ek1.add(e2);
        ek1.add(e3);
        ek1.add(e4);
        ek1.add(e5);

        Event byTitle = ek1.getByTitle("kino X");
        System.out.println(byTitle);
        byTitle = ek1.getByTitle("bla bla");
        System.out.println(byTitle);

        ArrayList<Event> byOrt = ek1.getByOrt("Graz");
        System.out.println(byOrt);
        byOrt = ek1.getByOrt("Wien");
        System.out.println(byOrt);

        ArrayList<Event> byPreis = ek1.getByEintrittsPreis(20, 60);
        System.out.println(byPreis);

        Event mostExpensiveGraz = ek1.getMostExpensiveByOrt("Graz");
        System.out.println(mostExpensiveGraz);

        Event mostExpensiveLondon = ek1.getMostExpensiveByOrt("London");
        System.out.println(mostExpensiveLondon);

        double avgPreisGraz = ek1.getAvgPreisByOrt("Graz");
        System.out.println(avgPreisGraz);

        double avgPreisWien = ek1.getAvgPreisByOrt("Wien");
        System.out.println(avgPreisWien);




    }
}
