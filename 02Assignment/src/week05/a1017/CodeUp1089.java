package week05.a1017;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = a+=d;
        }
        System.out.println(arr[n - 1]);
    }
}
