package week07.e1031.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam {

    public int[] solution(int[] answers) { // 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return
        int[] firstStudentAnswer = {1, 2, 3, 4, 5};
        int[] secondStudentAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudentAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] temp = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstStudentAnswer[i % firstStudentAnswer.length]) {
                temp[0] += 1;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == secondStudentAnswer[i % secondStudentAnswer.length]) {
                temp[1] += 1;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == thirdStudentAnswer[i % thirdStudentAnswer.length]) {
                temp[2] += 1;
            }
        }

        int max = Math.max(temp[0], Math.max(temp[1], temp[2]));
        List<Integer> maxScoreStudent = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (max == temp[i]) {
                maxScoreStudent.add(i + 1);
            }
        }

        int[] result = new int[maxScoreStudent.size()];
        for (int i = 0; i < maxScoreStudent.size(); i++) {
            result[i] = maxScoreStudent.get(i);
        }

        return result;

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
