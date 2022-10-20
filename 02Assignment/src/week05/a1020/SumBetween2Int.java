package week05.a1020;

import java.util.Scanner;

// 프로그래머스: 두 정수 사이의 합
public class SumBetween2Int {

    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;

        if (a < b) {
            for (int i = a; i <= b ; i++) {
                sum += i;
                answer = sum;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
                answer = sum;
            }
        } else {
            answer = a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        SumBetween2Int sumBetween2Int = new SumBetween2Int();
        long result = sumBetween2Int.solution(a, b);
        System.out.println(result);
    }
}
