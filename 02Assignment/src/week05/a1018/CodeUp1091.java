package week05.a1018;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a *= m;
            a += d;
        }
        System.out.println(arr[n - 1]);
    }
}
