package week05.a1018;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i = 1;

        while (true) {
            i++;
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}