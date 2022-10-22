package week05.a1018;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
