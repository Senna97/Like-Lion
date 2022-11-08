package week08.e1107.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisibleArray {

    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int element : arr) {
            if (element % divisor == 0) {
                answer.add(element);
            }
        }

        if (answer.size() == 0) {
            answer.add(-1);
        }

        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 6};
        int divisor = 10;
        DivisibleArray divisibleArray = new DivisibleArray();
        List<Integer> solution = divisibleArray.solution(arr, divisor);
        System.out.println(solution);
    }
}
