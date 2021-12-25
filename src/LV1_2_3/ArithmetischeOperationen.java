package LV1_2_3;

public class ArithmetischeOperationen {

    public static void main(String[] args) {
     int a =2;
     int b =30;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(Math.round((double) a/b*1000)/1000D);
        System.out.println(a*b);

     String Vergleich1= new String("Christoph");
        System.out.println(Vergleich1);
     String Vergleich2= new String("Christoph");
        System.out.println(Vergleich2);


     boolean sameObject = Vergleich1 == Vergleich2;
        System.out.println(Vergleich1+ ", " +Vergleich2);
        System.out.println("sameObject? "+sameObject);
     boolean sameValue = Vergleich1.equals(Vergleich2);
        System.out.println("sameValue? "+sameValue);
     // 1. Methode ohne Rückgabewert
        printNumber(5);
        printNumber(13);

        int myNumber = 18;
        printNumber(myNumber);

     //2. Methode mit Rückgabewert
     // 2.1 Aufruf der Mehode "add" mit input Parametern
     // und Speicherung in result und Ausdruck der Variable result.
        int result = add(7,7);
        System.out.println(result);
     // 2.2 Aufruf der Mehode "add" incl. variablen Deklaration
        System.out.println(add(9,9));
     // 2.3 Aufruf von add über Methode "printNumber"
        printNumber(add(31,13));
        printNumber(Math.round(divide(2,0)*100)/100D);
        printNumber(mutiply(5,5));
        printNumber(subtract(2,7));

    }//1. Methode ohne Rückgabewert
    public static void printNumber(double number){
        System.out.println("The Number is: "+number);


    }//2. Methode mit Rückgabewert
    public static int add(int r,int s){
        return r+s;
    }
    public static int mutiply(int r, int s){
        return r*s;
    }
    public static int subtract(int r, int s){
        return r-s;
    }
    public static double divide(double r, int s){
        if (s !=0){
        return  r/s;
        }
        return 0;
    }



}
