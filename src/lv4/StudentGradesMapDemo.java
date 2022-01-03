package lv4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentGradesMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> gradeOfStudents = new HashMap<>();

        //Schlüssel incl. Wert
        gradeOfStudents.put("Thomas ",5);
        gradeOfStudents.put("Sabine ",1);

        System.out.println("gradeOfStudents = "+gradeOfStudents);
        //Schlüsselwert ubdaten
        gradeOfStudents.put("Thomas ",3);
        System.out.println("gradeOfStudents = "+gradeOfStudents);

        //Ausgabe der Note für Thomas
        Integer gradeOfThomas = gradeOfStudents.get("Thomas ");
        System.out.println("gradeOfThomas = "+gradeOfThomas);

        //Iteration über alle Schlüssel
        Set<String> students = gradeOfStudents.keySet();
        for (String student :students) {
            Integer grade = gradeOfStudents.get(student);
            System.out.println("Student " + student + " hat die Note " + grade);
        }
        //Ausgabe der Note für Thomas
       // Integer gradeOfThomas = gradeOfStudents.get("Thomas");
       // System.out.println("gradeOfThomas = "+gradeOfThomas);

        //2. Möglichkeit um Schlüssel und Werte zu bekommen
        Set<Map.Entry<String,Integer>> entries = gradeOfStudents.entrySet();
        for (Map.Entry<String,Integer> entry:entries){
            System.out.println("Student = "+entry.getKey()+ " hat die Note "+entry.getValue());
        }

        }

}

