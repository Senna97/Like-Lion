package week04.a1014;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int n = 1; n <= num; n++) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
