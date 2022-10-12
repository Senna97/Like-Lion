package week04.e1011.algorithm;

import java.util.Scanner;

// CodeUp 1278 : 자릿수 계산
public class GetDigjt {

    int solution(int num) {
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        GetDigjt getDigjt = new GetDigjt();
        int result = getDigjt.solution(num);
        System.out.println(result);

    }
}
