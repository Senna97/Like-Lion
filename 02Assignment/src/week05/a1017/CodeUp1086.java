package week05.a1017;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double b = sc.nextDouble();

        double bit = 8;
        double num = 1024;

        double answer = w * h * b / bit / num / num;
        System.out.printf("%.2f %s", answer, "MB");
    }
}
