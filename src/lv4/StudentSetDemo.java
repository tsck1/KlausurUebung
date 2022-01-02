package lv4;

import java.util.HashSet;

public class StudentSetDemo {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Thomas Pontasch");
        students.add("Walter Radinger");

        String sabsi= "Sabine Pontasch";
        students.add(sabsi);
        System.out.println("students = "+students);

        students.remove("Walter Radinger");

        System.out.println("students = "+students);

        boolean isSabsiInSet = students.contains(sabsi);
        boolean isThomasInSet = students.contains("Thomas Pontasch");

        System.out.println("isSabsiInSet "+isSabsiInSet);
        System.out.println("isThomasInSet "+isThomasInSet);




        for ( String student :students){
            System.out.println("Student = " +student);
        }
    }
}
