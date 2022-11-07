package week08.algorithm;

import java.util.Scanner;

public class HarshadNumber {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = x % 10 + x % 100 / 10 + x / 100; // 자릿수의 합 구하기 – step1

        System.out.println(sum);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        HarshadNumber harshadNumber = new HarshadNumber();
        boolean solution = harshadNumber.solution(x);
        System.out.println(solution);
    }
}
