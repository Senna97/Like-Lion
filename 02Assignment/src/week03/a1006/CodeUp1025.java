package week03.a1006;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numUnit = {10000, 1000, 100, 10, 1};

        for (int i = 0; i < numUnit.length; i++) {
            int result = num / numUnit[i] * numUnit[i];
            num = num - result;
            System.out.printf("[%d]\n", result);
        }
    }
}
