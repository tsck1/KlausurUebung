package LV3;

public class DemoAnlageApp {
    public static void main(String[] args) {

        Anlage a= new Anlage("Sessel",300,15);
        System.out.println(a.toString());

        a.abschreiben();

        System.out.println(a.toString());


        a.simulate(5,100);
       // a.simulate2(5,100);

        Anlage neu = a.renew(400, 5);
        System.out.println(neu.toString());
    }
}
