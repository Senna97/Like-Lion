package week03.e1006.list;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    //외부에서 접근하지 못하게 private
    private final List<String> students;
    //private List<String> students = new ArrayList<>(); //초기화 방법(1)

    public ListExercise() {
        this.students = new ArrayList<>(); //초기화 방법(2)
        this.students.add("김경록");
        this.students.add("김미지");
        this.students.add("김민경");
        this.students.add("김민지");
    }

    public List<String> getStudents() {
        return students;
    }
}
