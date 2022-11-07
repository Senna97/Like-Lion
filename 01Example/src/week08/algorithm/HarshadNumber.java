package week08.algorithm;

import java.util.Scanner;

public class HarshadNumber {

    public boolean solution(int x) {
        boolean answer;

        int sum = 0;
        int temp = x; // 기존의 x를 남겨두기 위함
        while (temp > 0) { // 자릿수의 합 구하기 – step1
            sum += temp % 10;
            temp = temp / 10;
        }

        // 나누어 떨어지는지 check 하기 – step2
        answer = x % sum == 0;

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
