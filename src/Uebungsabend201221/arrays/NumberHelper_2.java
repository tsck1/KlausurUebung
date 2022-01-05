package Uebungsabend201221.arrays;

import java.util.Arrays;

public class NumberHelper_2 {

    public static void main(String[] args) {


        int [] testsorted = {1, 2, 3, 4, 5, 6 ,7, 8};
        int [] ausgansArr = {1, 5, 3, 1, 9, 2, 5};

        System.out.println("isSortedArray(testsorted) = " +isSortedArray(testsorted));
        System.out.println("isSortedArray(ausgansArr) = " +isSortedArray(ausgansArr));
        System.out.println("removeDuplicates(ausgansArr) = " + Arrays.toString(removeDuplicates(ausgansArr)));

    }
    public static boolean isSortedArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static int[] removeDuplicates(int[] numbers) {
       // int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0)
                continue;   // Continue bricht Schleifendurchlauf ab und beginnt wieder bei Schleifenkopf

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = -1;
                }
            }
        }

        return numbers;
    }

}
