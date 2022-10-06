package week03.e1005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();

        List<String> students = likeLion2th.getStudentList();
        List<Student> studentsobjs = likeLion2th.getStudentObjs();

        //for-each
        for (String student : students) {
            System.out.println(student);
        }

        //list 에 들어있는 element 개수 세기
        System.out.println("총 인원: " + students.size() + "명");
    }
}

