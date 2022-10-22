package week05.a1017;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            i++;

            if (sum >= num) {
                System.out.println(sum);
                break;
            }
        }
    }
}
