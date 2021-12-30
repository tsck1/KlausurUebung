package If_While_for;

public class ArrayDemo2 {

    public static void main(String[] args) {

        String [] Monat = new String[12];
        Monat[0]="Jänner";
        Monat[1]="Februar";
        Monat[2]="März";
        Monat[3]="April";
        Monat[4]="Mai";
        Monat[5]="Juni";
        Monat[6]="Juli";
        Monat[7]="August";
        Monat[8]="Septemper";
        Monat[9]="Oktober";
        Monat[10]="November";
        Monat[11]="Dezember";

        for (int i=0;i<12;i++){
            //System.out.println(Monat[i]);//untereinander
            System.out.print(Monat[i]+", ");//hintereinander
        }

    }
}
