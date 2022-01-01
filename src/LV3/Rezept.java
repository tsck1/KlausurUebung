package LV3;

import java.util.Arrays;

public class Rezept {

    private String rezeptName;
    private int personenAnzahl;
    private Zutat[] zutaten;

    public Rezept(String rezeptName, int personenAnzahl, Zutat[] zutaten) {
        this.rezeptName = rezeptName;
        this.personenAnzahl = personenAnzahl;
        this.zutaten = zutaten;
    }

    public String getRezeptName() {
        return rezeptName;
    }

    public int getPersonenAnzahl() {
        return personenAnzahl;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public void printRezept(){
        System.out.println("Rezeptname "+this.rezeptName);
        System.out.println("Personenanzahl "+this.personenAnzahl);
        System.out.println("Zutaten:");
        for (int i=0; i <this.zutaten.length;i++){
            System.out.println(this.zutaten[i].toString());
        }

    }
    public Rezept umrechnen(int personen){
        double faktor = personen/((double)getPersonenAnzahl());
        personenAnzahl = (int) (personenAnzahl*faktor);//gibt aktuelle personenanzahl aus

    Zutat[] neueZutaten = new Zutat[this.zutaten.length];
    for (int i=0;i<this.zutaten.length;i++){
        neueZutaten[i]= new Zutat(this.zutaten[i].getZutatName(),
                (int)(this.zutaten[i].getQuantity()*faktor));
    }
    //neues objekt anlegen
        Rezept neu = new Rezept(this.rezeptName,personenAnzahl,neueZutaten);
    return neu;

    }


    @Override
    public String toString() {
        return "Rezept{" +
                "rezeptName='" + rezeptName + '\'' +
                ", personenAnzahl=" + this.personenAnzahl +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }
}
