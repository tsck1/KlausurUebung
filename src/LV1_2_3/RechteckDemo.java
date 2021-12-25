package LV1_2_3;

public class RechteckDemo {

    public static void main(String[] args) {

        int länge = 3;
        int breite = 4;
        int Umfang;
        int Flaeche;

        Flaeche = länge* breite;
        Umfang = 2*länge + 2* breite;

        System.out.println("Für ein Rechteck mit der Länge "+länge+ " cm, und der Breite von " + breite+ " cm,");
        System.out.println(" beträgt der Flächeninhalt "+ Flaeche+ " cm², und der Umfang " + Umfang+ " cm.");


    }
}
