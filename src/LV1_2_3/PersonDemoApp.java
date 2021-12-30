package LV1_2_3;

public class PersonDemoApp {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.firstName="Thomas";
        p1.lastName="Pontasch";
        p1.age=49;
        p1.nationality="AUT";

        Person p2 = new Person();
        p2.firstName="Sabine";
        p2.lastName="Pontasch";
        p2.age=45;
        p2.nationality="AUT";

        System.out.println(p2.firstName+" "+p2.lastName+", "+p2.age+" Jahre, Nationalität: "+p2.nationality );

        p1.print();
        p2.print();

    }
}
