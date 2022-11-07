package week08.algorithm;

import java.util.PriorityQueue;

public class DivisibleArray2 {

    public PriorityQueue<Integer> solution(int[] arr, int divisor) {

        PriorityQueue<Integer> answer = new PriorityQueue<>();
        for (int element : arr) {
            if (element % divisor == 0) {
                answer.add(element);
            }
        }

        if (answer.size() == 0) {
            answer.add(-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 6};
        int divisor = 10;
        DivisibleArray2 divisibleArray = new DivisibleArray2();
        PriorityQueue<Integer> solution = divisibleArray.solution(arr, divisor);
        System.out.println(solution);
    }
}
