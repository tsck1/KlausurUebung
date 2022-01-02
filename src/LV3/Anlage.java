package LV3;

public class Anlage {

    private String Bezeichnung;
    private double initialWert;
    private int nutzungsdauer;
    private double restWert;
    private int alter;

    public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
        this.Bezeichnung = bezeichnung;
        this.initialWert = initialWert;
        this.nutzungsdauer = nutzungsdauer;
        this.restWert=initialWert;
        this.alter=0;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public double getInitialWert() {
        return initialWert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getRestWert() {
        return restWert;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return "Anlage{" +
                "Bezeichnung='" + Bezeichnung + '\'' +
                ", initialWert=" + initialWert +
                ", nutzungsdauer=" + nutzungsdauer +
                ", restWert=" + restWert +
                ", alter=" + alter +
                '}';
    }

    public void abschreiben(){
        alter++;
        if(alter<nutzungsdauer){
            restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));

        }
    }
    public void simulate(int maxJahre, int minWert) {
        int counter = 1;
        while (counter <= maxJahre && restWert > minWert) {

            System.out.println("Vorher > Jahr " + counter + " " + toString());
            abschreiben();
            System.out.println("Naher > Jahr " + counter + " " + toString());
            counter++;

        }
    }
        public void simulate2(int maxJahre, int minWert) {
            for (int i = 0; i < maxJahre; i++) {

                System.out.println("Vorher > Jahr " + i + " " + toString());
                abschreiben();
                System.out.println("Naher > Jahr " + i + " " + toString());

                if (restWert < minWert || restWert == 0) {
                    break;
                }
            }
        }
            public Anlage renew(int zusatzWert, int zusatzJahre)
            {
                double neu_initalWert = restWert + zusatzWert;
                int neu_nutzungsdauer = (this.nutzungsdauer - this.alter)
                        + zusatzJahre;

                Anlage neueAnlage = new Anlage(this.Bezeichnung,
                        neu_initalWert, neu_nutzungsdauer);

                return neueAnlage;
            }


}



