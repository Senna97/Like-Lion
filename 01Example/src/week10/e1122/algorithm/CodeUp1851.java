package week10.e1122.algorithm;

import java.util.Scanner;

public class CodeUp1851 {

    public void star(int num) {
        if (num <= 0) {
            return;
        }
        System.out.print("*");
        star(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CodeUp1851 codeUp1851 = new CodeUp1851();
        codeUp1851.star(n);
    }
}
