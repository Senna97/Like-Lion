package week10.e1122.algorithm;

import java.util.Scanner;

public class CodeUp1853 {

    public int sum(int num) {
        if (num <= 0) {
            return 0;
        }
        return num + sum(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CodeUp1853 codeUp1853 = new CodeUp1853();
        int sum = codeUp1853.sum(n);
        System.out.println(sum);
    }
}
