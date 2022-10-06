package week03.e1005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();


    public LikeLion2th() {
        Names names = new Names();
        this.students = names.names();
        this.studentObjs = names.getStudentObjs();
    }

    //멋쟁이사자처럼 백엔드 스쿨 2기 학생의 이름이 들어있는 리스트를 리턴하는 메서드
    public List<String> getStudentList() {
        return this.students;
    }

    public List<Student> getStudentObjs() {
        return this.studentObjs;
    }
}

