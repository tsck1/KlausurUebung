package LV3;

public class DemoBestellungApp {

    public static void main(String[] args) {
        Bestellzeile bz1= new Bestellzeile("Monitor",2,199);
        Bestellzeile bz2= new Bestellzeile("Stick",4,19);
        Bestellzeile bz3= new Bestellzeile("Stift",3,1);

        System.out.println(bz1.toString());
        System.out.println(bz2.toString());
        System.out.println(bz3.toString());

        System.out.println("bz2.getKosten() " +bz2.getKosten());

        Bestellzeile[] arr=new Bestellzeile[3];
        arr[0]=bz1;
        arr[1]=bz2;
        arr[2]=bz3;

        Bestellung order123 = new Bestellung("1224",arr);
        order123.printBestellung();
    }
}
