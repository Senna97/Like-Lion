package week08.algorithm;

import java.util.Scanner;

public class HarshadNumber {
    public boolean solution(int x) {
        boolean answer;

        int sum = 0;
        int temp = x;
        while (temp > 0) { // 자릿수의 합 구하기 – step1
            sum += temp % 10;
            temp = temp / 10;
        }

        if (x % sum == 0) { // 나누어 떨어지는지 check 하기 – step2
            answer = true;
        } else {
            answer = false;
        }

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