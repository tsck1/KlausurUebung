package lv4;

import java.util.ArrayList;

public class StudentListDemo {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Pontasch");
        students.add(new String("Hofer"));
        students.add("Maier");

        String studentPontom="PonTom";
        students.add(studentPontom);
        printStudents(students);

        students.remove("Maier");
        printStudents(students);

        String newStudent= "Thomas";
        //students.add(newStudent);
        boolean containsStudent = students.contains(newStudent);
        System.out.println("containsStudent ="+containsStudent);

        boolean inList = isInList(students,newStudent);
        System.out.println("inList = "+inList);

        boolean compareToStudent= isInList2(students,newStudent);
        System.out.println("compareToStudent ="+compareToStudent);


       //students.add(newStudent);
       students.add(0,"Erster");
       students.add(2,"Dritter");

      printStudents(students);
        students.set(2,"Dritter_1");
        printStudents(students);



    }
    public static boolean isInList(ArrayList<String>studentList,String student){
        for (String studentInList : studentList){
            if (studentInList.equals(student)){
                return true;
            }
        }
        studentList.add(student);
        return false;
    }
    public static boolean isInList2(ArrayList<String>studentList,String student){
        for (int i=0; i< studentList.size();i++){
            String stud = studentList.get(i);
            if (student.compareTo(stud)==0){

                return true;
            }
            //else studentList.add(student);
        }
        //studentList.add(student);
        return false ;
    }



    public static void printStudents(ArrayList<String> studentList) {
        for (String student : studentList) {
            System.out.println("student = " + student);
        }
        System.out.println("-----");
    }

}
