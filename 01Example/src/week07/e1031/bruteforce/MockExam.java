package week07.e1031.bruteforce;

import java.util.Arrays;

public class MockExam {

    public int[] solution(int[] answers) { // 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return
        int[] answer = {0, 0, 0};

        int[] firstStudentAnswer = {1, 2, 3, 4, 5};
        int[] secondStudentAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudentAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstStudentAnswer[i % firstStudentAnswer.length]) {
                answer[0] += 1;
            } else if (answers[i] == secondStudentAnswer[i % secondStudentAnswer.length]) {
                answer[1] += 1;
            } else if (answers[i] == thirdStudentAnswer[i % thirdStudentAnswer.length]) {
                answer[2] += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MockExam mockExam = new MockExam();
        int[] ex1 = new int[]{1, 2, 3, 4, 5};
        int[] ex2 = new int[]{1, 3, 2, 4, 2};

        int[] result1 = mockExam.solution(ex1);
        System.out.println(Arrays.toString(result1));

        int[] result2 = mockExam.solution(ex2);
        System.out.println(Arrays.toString(result2));
    }
}
