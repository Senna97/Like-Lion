package week05.e1017.algorithm;

import java.util.Scanner;

public class RightTriangle {

    public void getRightTriangle(int num, char ch) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 줄의 어떤 피라미드를 찍고 싶으신가요? (정수와 문자 입력) >> ");
        int num = sc.nextInt();
        char ch = sc.next().charAt(0);

        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.getRightTriangle(num, ch);
    }
}
