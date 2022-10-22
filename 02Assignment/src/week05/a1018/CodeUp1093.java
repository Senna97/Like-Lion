package week05.a1018;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int[] arr = new int[num1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[23];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i + 1) {
                    arr2[i]++;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d ", arr2[i]);
        }
    }
}
