package lV7_Vererbung_Bsp_Land;

public class DemoLandApp {

    public static void main(String[] args) {

        Bundesland steiermark = new Bundesland(2_000_000);
        Bundesland kaernten = new Bundesland(1_000_000);
        Bundesland burgenland = new Bundesland(1_500_000);


        Bundesstaat oesterreich = new Bundesstaat();
        oesterreich.add(kaernten);
        oesterreich.add(steiermark);
        oesterreich.add(burgenland);

        System.out.println("BSP von Österreich: "+oesterreich.getBruttoSozialProdukt());

        Bundesland bayern = new Bundesland(1_000_000);
        Bundesland berlin = new Bundesland(2_000_000);

        Bundesstaat de = new Bundesstaat();
        de.add(bayern);
        de.add(berlin);

        System.out.println("BSP von DE: "+de.getBruttoSozialProdukt());






    }

}
