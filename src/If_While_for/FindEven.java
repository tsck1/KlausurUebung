package If_While_for;

public class FindEven {

    public static void main(String[] args) {
        //int g=0;
        int i=13;
        int count=1;
        //durchläuft Schleife bie count =i
        while (count<=i){
            System.out.println("ich bin in der Schleife");

            if(count%2 ==0){
                System.out.println("bin gerade:"+count);
            }
            count++;
        }
        for (int j =1;j<=12;j++){
            System.out.println("Durchlauf NR: " +j);
        }
        for (int k =12;k>=0;k--){
            System.out.println("Durchlauf NR: " +k);
        }
        for (int h =15;h<=90;h+=5){
            System.out.println("5-Er-Schritte " +h);
        }
       // geradeZahlen(g);
       // System.out.println(geradeZahlen(g));
        geradeZahl();
        ungeradeZahl();
    }
    //Zusatzaufgabe Folie 59
    public static int geradeZahl(){
        for (int z=0; z<=14;z++){
            if (z%2==0){
                System.out.println("ich bin gerade "+z);;
            }//else {}
        }

        return 0;
    }
    //Zusatzaufgabe Folie 59
    public static int ungeradeZahl(){
        for (int z=0; z<=14;z++){
            if (z%2 !=0){
                System.out.println("ich bin ungerade "+z);
            }//else {}
        }

        return 0;
    }

   /* public static void geradeZahlen(){

    //    for (int g = 0; g<14; g++) {
    //        System.out.println("Durchlauf Nr.: " +g);
    //        if (g % 2 == 0){
    //            return g;
                }
        }
        return null;
    }*/

}

