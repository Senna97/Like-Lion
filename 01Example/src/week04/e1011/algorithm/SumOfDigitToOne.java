package week04.e1011.algorithm;

import java.util.Scanner;

public class SumOfDigitToOne {

    void solution(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num /10;

            if (sum >= 10) {
                num = num + sum;
                sum = 0;
                continue;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        SumOfDigitToOne sumOfDigitToOne = new SumOfDigitToOne();
        sumOfDigitToOne.solution(num);
    }
}
