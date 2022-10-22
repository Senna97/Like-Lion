package week05.a1017;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long r = sc.nextLong();
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = a *= r;
        }
        System.out.println(arr[n - 1]);
    }
}
