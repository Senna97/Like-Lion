package week12.e1207.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {

        Arrays.sort(scoville);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.add(scoville[i]);
        }

        int answer = 0;
        while (priorityQueue.peek() < K) {
            int first = priorityQueue.peek();
            priorityQueue.poll();
            int second = priorityQueue.peek();
            priorityQueue.poll();
            priorityQueue.add(first + second * 2);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        MoreSpicy moreSpicy = new MoreSpicy();
        int answer = moreSpicy.solution(scoville, 7);
        System.out.println(answer); // 2
    }
}
