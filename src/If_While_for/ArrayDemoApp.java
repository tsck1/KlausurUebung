package If_While_for;

import java.sql.Array;
import java.util.Arrays;

public class ArrayDemoApp {

    public static void main(String[] args) {

        int[] Array1 = {3, 4, 5};
        int[] Array2 = new int[3];
        Array2[0] = 7;
        Array2[1] = 1;
        Array2[2] = 3;
        int[] Array3 = new int[3];
        int sumArray1 = 0;//Für Aufgabe 8 Summe
        int sumArray2 = 0;

        //Array1 ausgeben
        for (int i =0; i<3; i++){
            System.out.print(Array1[i]+" ");

        }
        System.out.println();
        //Array2 ausgeben
        for (int i =0; i<3; i++){
            System.out.print(Array2[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++){
            Array3[i] = Array1[i] + Array2[i];
            System.out.print(Array3[i]+" ");
        }
        System.out.println();
        //System.out.println(Array3[i]);
        System.out.println(Array3[0]+", "+Array3[1]+", "+Array3[2]);

        for (int i = 0; i < 3; i++){
            Array3[i] = Array1[i] * Array2[i];
            System.out.print(Array3[i]+" ");

        }
        System.out.println();
        System.out.println(Array3[0]+", "+Array3[1]+", "+Array3[2]);

        //int sumArray1 als lokale Variable angelegt
        for (int i =0; i<3; i++){
           sumArray1=Array1[i]+ sumArray1;
        }
        System.out.println(sumArray1);

        for (int i=0;i<3;i++){
            sumArray2=Array2[i]+sumArray2;
        }
        System.out.println(sumArray2);

    }


}
