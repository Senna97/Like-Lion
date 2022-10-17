package week05.e1017.algorithm;

import java.util.Scanner;

public class Triangle {

    private String letter = "*";

    public Triangle() {
    }

    public Triangle(String letter) {
        this.letter = letter;
    }

    public void getRightTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 줄의 삼각형을 찍고 싶으신가요? >> ");
        int num = sc.nextInt();

        Triangle triangle = new Triangle("@");
        triangle.getRightTriangle(num);
    }
}
