package week04.a1011;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a + b + c);
        System.out.printf("%.1f", ((double)a + b + c) / 3);
    }
}
