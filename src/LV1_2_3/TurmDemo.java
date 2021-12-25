package LV1_2_3;

public class TurmDemo {

    public static void main(String[] args) {
        int number = 10;
        int count = 2;
        int result;

        while (count <= 9){
            result= number * count;
            System.out.println("number= "+number+ " * count= "+count+ " = result "+result);
            number = result;
            count++;
        }
        count = 9;
        while (count >= 2){
            result= number/count;
            System.out.println("number= "+number+ " * count= "+count+ " = result "+result);
            number = result;
            count--;

        }
    }


}
