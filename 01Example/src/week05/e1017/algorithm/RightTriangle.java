package week05.e1017.algorithm;

import java.util.Scanner;

public class RightTriangle {

    public void getRightTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.getRightTriangle(num);
    }
}
