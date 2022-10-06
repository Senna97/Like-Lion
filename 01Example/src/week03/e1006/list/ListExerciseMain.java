package week03.e1006.list;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getStudents();
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("총 인원: " + students.size() + "명");
    }
}
