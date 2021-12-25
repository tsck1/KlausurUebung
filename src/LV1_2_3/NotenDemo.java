package LV1_2_3;

public class NotenDemo {

    public static void main(String[] args) {

        System.out.println(getNotentext(90));
        System.out.println(getNotentext(40));
        System.out.println(getNotentext(51));
        System.out.println(getNotentext(65));
        System.out.println(getNotentext(78));
        System.out.println(getNotentext(77));

    }
    public static String getNotentext(int punkte){
        if (punkte >= 90){
            return "Sehr Gut";
        }if (punkte >= 78){
            return "Gut";
        }if (punkte >= 65){
            return "Befriedigend";
        }if (punkte >= 51){
            return "Genügend";
        }else {
            return "Ungenügend";
        }

    }
}
