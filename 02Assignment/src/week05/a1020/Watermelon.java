package week05.a1020;

import java.util.Scanner;

// 프로그래머스: 수박수박수박수박수박수?
public class Watermelon {

    public String solution(int n) {
        String answer = "";
        answer = "수박";

        if (n % 2 == 0) {
            answer = answer.repeat(n / 2);
        } else {
            answer = answer.repeat(n / 2);
            answer = answer + "수";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Watermelon watermelon = new Watermelon();
        String result = watermelon.solution(n);
        System.out.println(result);
    }
}
