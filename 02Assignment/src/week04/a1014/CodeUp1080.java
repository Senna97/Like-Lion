package week04.a1014;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        int sum = 0;

        while (true) {
            sum += n;

            if (sum >= num) {
                System.out.println(n);
                break;
            }

            n++;
        }
    }
}
