package LV3;

import LV3.Rezept;
import LV3.Zutat;

public class DemoRezeptApp {

    public static void main(String[] args) {

        Zutat butter = new Zutat("Butter",350);
        Zutat mehl = new Zutat("Mehl",150);
        Zutat milch = new Zutat("Milch",250);

        Zutat omasGeheimZutat= new Zutat("Feenstaub",120);

        Zutat[] zutaten ={butter,mehl,milch,omasGeheimZutat};
        System.out.println();
        Rezept weihnachtsKeks = new Rezept("Weihnachtskeks ",4,zutaten);
        weihnachtsKeks.printRezept();

        Rezept wk10= weihnachtsKeks.umrechnen(10);
        wk10.printRezept();
        weihnachtsKeks = new Rezept("Weihnachtskeks ", 4, zutaten);
        weihnachtsKeks.printRezept();

    }
}
