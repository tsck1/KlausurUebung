package If_While_for;

public class BruchDemoApp {
    public static void main(String[] args) {

        Bruch b45 = new Bruch(4,5);
        Bruch b15 = new Bruch(1,5);
        Bruch b23 = new Bruch(2,3);

        System.out.println("Bruch 1/5 :"+b15.print()+ " = "+ b15.toDecimal());
        System.out.println(Bruch.anzahlBruch);
        System.out.println("Bruch 2/3 :"+b23.print()+ " = "+ b23.toDecimal());
        System.out.println(Bruch.anzahlBruch);
        System.out.println("Bruch 4/5 :"+b45.print()+ " = "+ b45.toDecimal());
        System.out.println(Bruch.anzahlBruch);

        Bruch erg= b45.multiplicate(b15);
        System.out.println(erg.print()+" = "+erg.toDecimal());
        System.out.println(Bruch.anzahlBruch);

        Bruch erg1= b45.multiplicate(b15,b23);
        System.out.println(erg1.print()+" = "+erg1.toDecimal());
        System.out.println(Bruch.anzahlBruch);

    }
}
