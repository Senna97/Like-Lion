package week10.e1123.algorithm;

import java.util.Scanner;

public class CodeUp1912 {

    public int factorial(int num) {
        if (num <= 0) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CodeUp1912 codeUp1912 = new CodeUp1912();
        int factorial = codeUp1912.factorial(n);
        System.out.println(factorial);
    }
}
