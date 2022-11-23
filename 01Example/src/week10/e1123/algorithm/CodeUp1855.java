package week10.e1123.algorithm;

import java.util.Scanner;

public class CodeUp1855 {

    public int fibonacciNum(int num) {
        if (num <= 2) {
            return 1;
        }
        return fibonacciNum(num - 1) + fibonacciNum(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CodeUp1855 codeUp1855 = new CodeUp1855();
        int fibonacciNum = codeUp1855.fibonacciNum(n);
        System.out.println(fibonacciNum);
    }
}
