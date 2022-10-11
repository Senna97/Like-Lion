package week04.a1011;

import java.util.Scanner;

public class CodeUp1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 1;

        for (int i = 0; i < b; i++) {
            c *= 2;
        }

        System.out.println(a * c);
    }
}
