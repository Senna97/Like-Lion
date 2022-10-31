package week07.e1031.bruteforce;

import java.util.Arrays;

public class MockExam {

    public int solution(int[] answers) { // 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return
//        int[] answer = {};

        int[] firstStudentAnswer = new int[]{1, 2, 3, 4, 5};
        int[] secondStudentAnswer = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudentAnswer = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstStudentAnswerCount = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] % firstStudentAnswer[i] == 0) {
                firstStudentAnswerCount++;
            }
        }
        return firstStudentAnswerCount;

//        return answer;
    }

    public static void main(String[] args) {
        MockExam mockExam = new MockExam();
        int[] ex1 = new int[]{1, 2, 3, 4, 5};
        int[] ex2 = new int[]{1, 3, 2, 4, 2};

        int result1 = mockExam.solution(ex1);
        System.out.println(result1);

        int result2 = mockExam.solution(ex2);
        System.out.println(result2);
    }
}
