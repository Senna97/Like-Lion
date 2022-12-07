package week12.e1207.algorithm;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.add(scoville[i]);
        }

        int answer = 0;
        while (priorityQueue.peek() < K) {
            answer++;
            if (priorityQueue.size() >= 2) {
                priorityQueue.add(priorityQueue.poll() + priorityQueue.poll() * 2);
            } else {
                return -1;
            }
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
