package week10.e1122.algorithm;

import java.util.Scanner;

public class CodeUp1854 {

    public long sum(long num) {
        if (num < 10) {
            return num % 10;
        }
        return num % 10 + sum(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        CodeUp1854 codeUp1854 = new CodeUp1854();
        long sum = codeUp1854.sum(n);
        System.out.println(sum);
    }
}