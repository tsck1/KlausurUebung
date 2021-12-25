package LV1_2_3;

public class WinterreifenpflichtDemo {

    public static void main(String[] args) {
        int temperatur= 4;
        boolean rutschigeFahrbahn=true;
     //   boolean winterreifenPflicht = isWinterreifenPflicht(temperatur,rutschigeFahrbahn);

        System.out.println(isWinterreifenPflicht(temperatur,rutschigeFahrbahn));
        System.out.println(isWinterreifenPflicht(12,true));
        printWinterreifenWahl(isWinterreifenPflicht(3,false));
    }
    public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
        if ( (temperatur<10 && rutschigeFahrbahn) || temperatur<4){
            return true;
        }
        return false;
    }
    public static void printWinterreifenWahl(boolean isWinterreifenPflicht){
        if (isWinterreifenPflicht){
            System.out.println(" Winterreifenpflicht - Winterreifen sind zu verwenden");
        }else {
            System.out.println("wintereifen müssen nicht verwendet wertden");
        }
    }
}
