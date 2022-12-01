package week11.e1201.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k) {
                pq.add(score[i]);
            } else if (pq.peek() < score[i]) {
                pq.poll();
                pq.add(score[i]);
            }
            answer[i] = pq.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] score = new int[]{10, 100, 20, 150, 1, 100, 200};
        HallOfFame hallOfFame = new HallOfFame();
        int[] answer = hallOfFame.solution(3, score);
        System.out.println(Arrays.toString(answer)); // 10, 10, 10, 20, 20, 100, 100
    }
}
