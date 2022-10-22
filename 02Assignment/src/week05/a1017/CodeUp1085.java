package week05.a1017;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double h = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = sc.nextDouble();

        double bit = 8;
        double num = 1024;

        double answer = h * b * c * s / bit / num / num;
        System.out.printf("%.1f %s", answer, "MB");
    }
}
