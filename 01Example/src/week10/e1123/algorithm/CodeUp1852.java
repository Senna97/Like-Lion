package week10.e1123.algorithm;

import java.util.Scanner;

public class CodeUp1852 {

    public void printNum(int initial, int num) {

        if (initial > num) {
            return;
        }

        System.out.printf("%d ", initial);
        printNum(initial + 1, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CodeUp1852 codeUp1852 = new CodeUp1852();
        codeUp1852.printNum(1, n);
    }
}
